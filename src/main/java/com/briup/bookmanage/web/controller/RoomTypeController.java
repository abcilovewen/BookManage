package com.briup.bookmanage.web.controller;

import com.briup.bookmanage.bean.Room;
import com.briup.bookmanage.bean.RoomType;
import com.briup.bookmanage.service.IRoomService;
import com.briup.bookmanage.service.IRoomTypeService;
import com.briup.bookmanage.util.Message;
import com.briup.bookmanage.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/roomType")
@Api(description = "阅览室类型管理")
public class RoomTypeController {
    @Autowired
    private IRoomTypeService roomTypeService;


    @GetMapping("/findAll")
    @ApiOperation(value = "查询全部阅览室类型")
    public Message findAll(){
        List<RoomType> all =roomTypeService.findAll();
        return MessageUtil.success(all);
    }
    @PostMapping("/add")
    @ApiOperation(value = "添加阅览室类型")

    public Message add(RoomType roomType) {
        roomTypeService.saveOrUpdate(roomType);
        return MessageUtil.success("添加成功");
    }
    @GetMapping("/update")
    @ApiOperation(value = "更改阅览室类型信息")

    public Message update(RoomType roomType) {
        roomTypeService.saveOrUpdate(roomType);
        return MessageUtil.success();
    }
    @GetMapping("/deleteById")
    @ApiOperation(value = "删除阅览室类型")
    @ApiImplicitParam(name = "id",value = "阅览室类型id",paramType = "query",dataType = "int",required = true)
    public Message deleteById(int id){
        roomTypeService.delectById(id);
        return MessageUtil.success();
    }
    @GetMapping("/delectBatch")
    @ApiOperation(value = "批量阅览室类型")
    public Message delectBatch(int[] ids) {
        for (int id : ids) {
            roomTypeService.delectBatch(id);
        }
        return MessageUtil.success();
    }
    @GetMapping("/selectById")
    @ApiOperation(value = "根据id查询阅览室类型")
    @ApiImplicitParam(name = "id",value = "阅览室id",paramType = "query",dataType = "int",required = true)
    public Message selectById(int id){
        RoomType room=roomTypeService.selectById(id);
        return  MessageUtil.success(room);
    }

}
