package com.briup.bookmanage.web.controller;

import com.briup.bookmanage.bean.Borrow;
import com.briup.bookmanage.bean.ex.BackBook;
import com.briup.bookmanage.bean.ex.BookEX;
import com.briup.bookmanage.bean.ex.BorrowBook;
import com.briup.bookmanage.bean.ex.BorrowEX;
import com.briup.bookmanage.service.IBookService;
import com.briup.bookmanage.service.IBorrowService;
import com.briup.bookmanage.util.Message;
import com.briup.bookmanage.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.List;

@RestController
@RequestMapping("/borrow")
@Api(description = "图书借阅管理")
public class BorrowController {
    @Autowired
    private IBorrowService borrowService;
    @Autowired
    private IBookService bookService;
    @GetMapping("/selectBorrow")
    @ApiOperation(value = "条件查询借阅信息")
    public Message selectBorrow(String key,String word){
        List<BorrowEX> list = borrowService.search(key,word);
        return MessageUtil.success(list);
    }
    @GetMapping("/deleteById")
    @ApiOperation(value = "根据id删除借阅信息")
    @ApiImplicitParam(name = "id",value = "借阅id",paramType = "query",dataType = "int",required = true)
    public Message deleteById(int id){
        borrowService.deleteById(id);
        return MessageUtil.success();
    }

    @PostMapping("/borrowBook")
    @ApiOperation(value = "借阅图书")

    public Message borrow(BorrowBook borrow){

        if(borrow.getIfback()==1){
            return  MessageUtil.success("借阅图书失败，请正确填写信息");
        }else{
            int id = borrow.getBookId();
            BookEX bookEX = bookService.findStatus(id);
            System.out.println(bookEX.getStatus());
            if(bookEX.getStatus().equals("在库")){
                borrowService.borrow(borrow);
                String status="外借";
                bookService.updateStatus(id,status);
                return MessageUtil.success("借阅图书成功");
            }else {
                return  MessageUtil.success("借阅图书失败，你借的图书已经外借，请选择别的书籍借阅");
            }
        }
    }

    @PostMapping("/backBook")
    @ApiOperation(value = "归还图书")
    public Message backBook(BackBook book){
        if(book.getId()==null && book.getIfback()==0 ){
            return  MessageUtil.success("归还图书失败");
        }else {
            int id=book.getId();
            BorrowEX bDate = borrowService.findBdate(id);
            System.out.println(bDate);
            String status="在库";
            int bookId = book.getBookId();
            bookService.updateStatus(bookId,status);
            System.out.println("借书的日期是："+bDate.getbDate());
            System.out.println("还书的日期是："+book.getrDate());
            long day = (book.getrDate().getTime()-bDate.getbDate().getTime())/(24 * 60 * 60 * 1000);
            System.out.println(day);
            if(day <= 30){
                double fine=0.00;
                System.out.println(fine);
                borrowService.fine(id,fine);

            }else if(day <= 60||day > 30){
                double fine =(double) (day - 30) * 0.10;
                System.out.println(fine);
                borrowService.fine(id,fine);
            }else{
                double fine =(double) 3.0 + (day - 60) * 0.20;
                System.out.println(fine);
                borrowService.fine(id,fine);
            }
            borrowService.back(book);
            return MessageUtil.success("归还图书成功");
        }
    }
}
