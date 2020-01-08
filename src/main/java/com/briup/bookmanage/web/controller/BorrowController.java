package com.briup.bookmanage.web.controller;

import com.briup.bookmanage.bean.Borrow;
import com.briup.bookmanage.bean.ex.BackBook;
import com.briup.bookmanage.bean.ex.BorrowBook;
import com.briup.bookmanage.bean.ex.BorrowEX;
import com.briup.bookmanage.service.IBorrowService;
import com.briup.bookmanage.util.Message;
import com.briup.bookmanage.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/borrow")
@Api(description = "图书借阅管理")
public class BorrowController {
    @Autowired
    private IBorrowService borrowService;
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
        }else {
            borrowService.borrow(borrow);
            return MessageUtil.success("借阅图书成功");
        }
        }

    @PostMapping("/backBook")
    @ApiOperation(value = "归还图书")
    public Message backBook(BackBook book){
        if(book.getId()==null && book.getIfback()==0 ){
            return  MessageUtil.success("归还图书失败");
        }else {
            borrowService.back(book);
            return MessageUtil.success("归还图书成功");

        }
    }
}
