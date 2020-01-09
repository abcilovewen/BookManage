package com.briup.bookmanage.service.impl;

import com.briup.bookmanage.bean.Mess;
import com.briup.bookmanage.bean.MessExample;
import com.briup.bookmanage.mapper.MessMapper;
import com.briup.bookmanage.service.IMessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessServiceImpl implements IMessService {

    @Autowired
    private MessMapper messMapper;

    @Override
    public List<Mess> findAll() throws RuntimeException {
        MessExample messExample = new MessExample();
        List<Mess> list = messMapper.selectByExample(messExample);
        return list;
    }

    @Override
    public void saveOrUpdate(Mess mess) throws RuntimeException {
        if (mess == null) {
            throw new RuntimeException("参数为空");
        }
        if (mess.getId() == null) {
            messMapper.insert(mess);
        } else {
            messMapper.updateByPrimaryKey(mess);
        }
    }

    @Override
    public void delectById(int id) throws RuntimeException {
        messMapper.deleteByPrimaryKey(id);
    }
}
