package com.briup.bookmanage.service.impl;

import com.briup.bookmanage.bean.Reader;
import com.briup.bookmanage.bean.ReaderExample;
import com.briup.bookmanage.bean.ex.ReaderEX;
import com.briup.bookmanage.mapper.ReaderMapper;
import com.briup.bookmanage.mapper.ex.ReaderEXMapper;
import com.briup.bookmanage.service.IReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderServiceImpl implements IReaderService {

    @Autowired
    private ReaderMapper readerMapper;
    @Autowired
    private ReaderEXMapper readerEXMapper;

    @Override
    public void addOrUpdate(ReaderEX readerEX) throws RuntimeException {
        if (readerEX == null){
            throw new RuntimeException("参数错误");
        } if (readerEX.getId() == null) {//添加
            readerEXMapper.insert(readerEX);
        } else {// 修改
            readerEXMapper.update(readerEX);
        }
    }

    @Override
    public ReaderEX selectById(int id) throws RuntimeException {
        ReaderEX reader = readerEXMapper.findById(id);
        return reader;
    }

    @Override
    public List<ReaderEX> findAll() throws RuntimeException {
        List<ReaderEX> all = readerEXMapper.findAll();
        return all;
    }

    @Override
    public void deleteById(int id) throws RuntimeException {
        readerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<ReaderEX> search(String word) throws RuntimeException {
        word = word == null ? "" :word;
        if (word == null && "".equals(word)){
            return findAll();
        } else {
            word = "%" + word + "%";
            return readerEXMapper.search(word);
        }
    }
}
