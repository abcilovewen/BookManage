package com.briup.bookmanage.web.controller;

import com.briup.bookmanage.bean.Mess;
import com.briup.bookmanage.service.IMessService;
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
@RequestMapping("/message")
@Api(description = "通告管理")
public class MessController {
    @Autowired
    private IMessService messageService;


    @GetMapping("/findAll")
    @ApiOperation(value = "查询全部通告")
    public Message findAll(){
        List<Mess> all=messageService.findAll();
        return MessageUtil.success(all);
    }
    @PostMapping("/add")
    @ApiOperation(value = "添加通告")

    public Message add(Mess mess) {
        messageService.saveOrUpdate(mess);
        return MessageUtil.success("添加成功");
    }
    @GetMapping("/update")
    @ApiOperation(value = "更改通告信息")

    public Message update(Mess mess) {
        messageService.saveOrUpdate(mess);
        return MessageUtil.success();
    }
    @GetMapping("/deleteById")
    @ApiOperation(value = "删除通告")
    @ApiImplicitParam(name = "id",value = "通告id",paramType = "query",dataType = "int",required = true)
    public Message deleteById(int id){
        messageService.delectById(id);
        return MessageUtil.success();
    }
}
