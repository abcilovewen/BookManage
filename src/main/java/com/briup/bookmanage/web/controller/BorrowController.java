package com.briup.bookmanage.web.controller;

import com.briup.bookmanage.bean.Borrow;
import com.briup.bookmanage.service.IBorrowService;
import com.briup.bookmanage.util.Message;
import com.briup.bookmanage.util.MessageUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BorrowController {
    @Autowired
    private IBorrowService borrowService;
    @GetMapping("/findAll")
    @ApiOperation(value = "查询图书")
    public Message findAll(){
        List<Borrow> all = borrowService.findAll();
        return MessageUtil.success(all);

    }

}
