package com.briup.bookmanage.web.controller;

import com.briup.bookmanage.bean.Administrator;
import com.briup.bookmanage.bean.Book;
import com.briup.bookmanage.bean.Reader;
import com.briup.bookmanage.service.IAdministratorService;
import com.briup.bookmanage.service.IBookService;
import com.briup.bookmanage.util.Message;
import com.briup.bookmanage.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(description = "图书管理")
public class BookController {
    @Autowired
    private IBookService iBookService;


    @GetMapping("/findAllBook")
    @ApiOperation(value = "查询全部图书")
    public Message findAllBook(){
        List<Book> all=iBookService.findAll();
        return MessageUtil.success(all);
    }
    @PostMapping("/addBook")
    @ApiOperation(value = "添加图书")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name",value = "书名",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "author",value = "作者",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "price",value = "价格",paramType = "query",dataType = "double"),
            @ApiImplicitParam(name = "status",value = "状态",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "type",value = "类别",paramType = "query",dataType = "String")
    })
    public Message addBook(Book book) {
        iBookService.saveOrUpdate(book);
        return MessageUtil.success(book);
    }
    @GetMapping("/updateBook")
    @ApiOperation(value = "更改信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "图书id", paramType = "query", dataType = "int", required = true),
            @ApiImplicitParam(name = "status",value = "状态",paramType = "query",dataType = "String")
    })

    public Message updateBook(Book book) {
      iBookService.saveOrUpdate(book);
        return MessageUtil.success();
    }
    @GetMapping("/deleteBookById")
    @ApiOperation(value = "删除图书")
    @ApiImplicitParam(name = "id",value = "图书id",paramType = "query",dataType = "int",required = true)
    public Message deleteBookById(int id){
        iBookService.delectById(id);
        return MessageUtil.success();
    }
    @GetMapping("/delectBookBatch")
    @ApiOperation(value = "批量删除图书")
    public Message delectBookBatch(int[] ids) {
        for (int id : ids) {
           iBookService.delectBatch(id);
        }
        return MessageUtil.success();
    }
    @GetMapping("/selectBookById")
    @ApiOperation(value = "根据id查询图书")
    @ApiImplicitParam(name = "id",value = "图书id",paramType = "query",dataType = "int",required = true)
    public Message selectBookById(int id){
        Book book=iBookService.selectById(id);
        return  MessageUtil.success(book);
    }
}
