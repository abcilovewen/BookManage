package com.briup.bookmanage.service.impl;

import com.briup.bookmanage.bean.Borrow;
import com.briup.bookmanage.bean.BorrowExample;
import com.briup.bookmanage.bean.ex.BorrowEX;
import com.briup.bookmanage.mapper.BorrowMapper;
import com.briup.bookmanage.mapper.ex.BorrowEXMapper;
import com.briup.bookmanage.service.IBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowServiceImpl implements IBorrowService {

    @Autowired
    private BorrowMapper borrowMapper;

    @Autowired
    private BorrowEXMapper borrowEXMapper;

    @Override
    public List<BorrowEX> findAll() throws RuntimeException {
        List<BorrowEX> list = borrowEXMapper.findAll();
        return list;
    }

    @Override
    public List<BorrowEX> search(String keys, String word) throws RuntimeException {
        word = word == null ? "" : word;
        if((keys == null || "".equals(keys)) && (word == null || "".equals(word)) ) {
            return findAll();
        // key 为空    word不为空 表示 下拉框没有选择，后面的输入框有内容
        }if (((keys == null) || "".equals(keys)) && !"".equals(word)) {
            word = "%" + word + "%";
            return borrowEXMapper.selectName(word);
        // 下拉框选择读者名字查询就根据名字查询
        } else if ("读者姓名".equals(keys)) {
            return borrowEXMapper.selectReaderName(word);

        //  下拉框选择图书名称查询就根据图书名称查询
        } else if ("图书名称".equals(keys)) {
            return borrowEXMapper.selectBookName(word);
        }
        return null;
    }

    @Override
    public void deleteById(int id) throws RuntimeException {
        borrowMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void borrow(Borrow borrow) throws RuntimeException {
            borrowMapper.insert(borrow);
    }

    @Override
    public void back(Borrow borrow) throws RuntimeException {
        borrowMapper.updateByPrimaryKey(borrow);
    }

}
