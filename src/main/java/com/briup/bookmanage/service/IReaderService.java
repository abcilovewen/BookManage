package com.briup.bookmanage.service;

import com.briup.bookmanage.bean.Reader;
import com.briup.bookmanage.bean.ex.ReaderEX;

import java.util.List;

public interface IReaderService {
    void addOrUpdate(ReaderEX readerEx) throws RuntimeException;

    ReaderEX selectById(int id) throws RuntimeException;

    List<ReaderEX> findAll() throws RuntimeException;

    void deleteById(int id) throws RuntimeException;

    List<ReaderEX> search(String word)throws RuntimeException;
}
