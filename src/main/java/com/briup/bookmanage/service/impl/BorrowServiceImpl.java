package com.briup.bookmanage.service.impl;

import com.briup.bookmanage.bean.Borrow;
import com.briup.bookmanage.bean.BorrowExample;
import com.briup.bookmanage.mapper.BorrowMapper;
import com.briup.bookmanage.service.IBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowServiceImpl implements IBorrowService {

    @Autowired
    private BorrowMapper borrowMapper;

    @Override
    public List<Borrow> findAll() throws RuntimeException {
        BorrowExample example = new BorrowExample();
        List<Borrow> list = borrowMapper.selectByExample(example);
        return list;
    }
}
