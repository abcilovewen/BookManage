package com.briup.bookmanage.mapper.ex;

import com.briup.bookmanage.bean.Reader;
import com.briup.bookmanage.bean.ex.ReaderEX;

import java.util.List;

public interface ReaderEXMapper {
    List<ReaderEX> findAll();
    ReaderEX findById(int id);
    List<ReaderEX> search(String word);
}
