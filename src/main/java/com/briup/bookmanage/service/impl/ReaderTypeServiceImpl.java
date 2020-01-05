package com.briup.bookmanage.service.impl;

import com.briup.bookmanage.bean.ReaderType;
import com.briup.bookmanage.mapper.ReaderTypeMapper;
import com.briup.bookmanage.service.IReaderService;
import com.briup.bookmanage.service.IReaderTypeService;
import com.briup.bookmanage.util.Message;
import com.briup.bookmanage.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReaderTypeServiceImpl implements IReaderTypeService{

    @Autowired
    private ReaderTypeMapper readerTypeMapper;

    @Override
    public ReaderType find(int id) throws RuntimeException {
        ReaderType readerType = readerTypeMapper.selectByPrimaryKey(id);
        return readerType;

    }
}
