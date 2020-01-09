package com.briup.bookmanage.mapper.ex;

import com.briup.bookmanage.bean.ex.BorrowEX;

import java.util.List;

public interface BorrowEXMapper {
    //查询
    List<BorrowEX> findAll();
    List<BorrowEX> selectBookName(String word);
    List<BorrowEX> selectReaderName(String word);
    List<BorrowEX> selectName(String word);

    BorrowEX selectBdate(int id);
    int updatefine(int id,Double fine);
}
