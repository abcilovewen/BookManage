package com.briup.bookmanage.web.controller;

import com.briup.bookmanage.bean.Administrator;
import com.briup.bookmanage.service.IAdministratorService;
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
@Api(description = "管理员管理")
public class AdministratorController {
    @Autowired
    private IAdministratorService iAdministratorService;


    @GetMapping("/findAll")
    @ApiOperation(value = "查询全部管理员")
    public Message findAll(){
        List<Administrator>all=iAdministratorService.findAll();
        return MessageUtil.success(all);
    }

    @PostMapping("/add")
    @ApiOperation(value = "添加管理员")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "管理员id",paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "name",value = "姓名",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "age",value = "年龄",paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "work",value = "职能",paramType = "query",dataType = "String")
    })
    public Message add(Administrator administrator) {
        iAdministratorService.saveOrUpdate(administrator);
        return MessageUtil.success(administrator);
    }
    @GetMapping("/update")
    @ApiOperation(value = "更改信息")
    @ApiImplicitParam(name = "id",value = "管理员id",paramType = "query",dataType = "int",required = true)

    public Message update(Administrator administrator){
       iAdministratorService.saveOrUpdate(administrator);
        return MessageUtil.success();
    }
    @GetMapping("/deleteById")
    @ApiOperation(value = "删除")
    @ApiImplicitParam(name = "id",value = "管理员id",paramType = "query",dataType = "int",required = true)
    public Message deleteById(int id){
        iAdministratorService.delectById(id);
        return MessageUtil.success();
    }
    @GetMapping("/delectBatch")
    @ApiOperation(value = "批量删除")
    public Message delectBatch(int[] ids) {
        for (int id : ids) {
           iAdministratorService.delectBatch(id);
        }
        return MessageUtil.success();
    }
    @GetMapping("/selectById")
    @ApiOperation(value = "根据id查询管理员")
    @ApiImplicitParam(name = "id",value = "管理员id",paramType = "query",dataType = "int",required = true)
    public Message selectById(int id){
        Administrator administrator=iAdministratorService.selectById(id);
        return  MessageUtil.success(administrator);
    }
}
