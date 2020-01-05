package com.briup.bookmanage.web.controller;

import com.briup.bookmanage.bean.Reader;
import com.briup.bookmanage.bean.ReaderType;
import com.briup.bookmanage.bean.ex.ReaderEX;
import com.briup.bookmanage.service.IReaderService;
import com.briup.bookmanage.service.IReaderTypeService;
import com.briup.bookmanage.util.Message;
import com.briup.bookmanage.util.MessageUtil;
import com.sun.xml.internal.ws.api.model.MEP;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reader")
@Api(description = "读者管理")
public class ReaderController {
    @Autowired
    private IReaderService iReaderService;
    @Autowired
    private IReaderTypeService iReaderTypeService;

    @PostMapping("/add")
    public Message add(Reader reader){
        iReaderService.addOrUpdate(reader);
        return MessageUtil.success("操作成功");
    }

    @PostMapping("/update")
    public Message update(Reader reader){
        iReaderService.addOrUpdate(reader);
        return MessageUtil.success("操作成功");
    }

    @GetMapping("/delete")
    public Message delete(int id){
        iReaderService.deleteById(id);
        return MessageUtil.success("操作成功");
    }

    @GetMapping("/deleteBatch")
    public Message deleteBatch(int[] ids){
        for (int id : ids) {
            iReaderService.deleteById(id);
        }
        return MessageUtil.success("操作成功");
    }

    @GetMapping("/findById")
    public Message findById(int id){
        ReaderEX readerEX = iReaderService.selectById(id);
        return MessageUtil.success(readerEX);
    }

    @GetMapping("/findAll")
    public Message findAll(){
        List<ReaderEX> list = iReaderService.findAll();
        return MessageUtil.success(list);
    }

    @GetMapping("search")
    public Message search(String word){
        List<ReaderEX> search = iReaderService.search(word);
        return MessageUtil.success(search);
    }
}
