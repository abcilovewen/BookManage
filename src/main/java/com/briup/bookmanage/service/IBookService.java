package com.briup.bookmanage.service;

import com.briup.bookmanage.bean.Book;
import com.briup.bookmanage.bean.Reader;
import com.briup.bookmanage.bean.ex.BookEX;

import java.util.List;

public interface IBookService {
    List<Book> findAll() throws RuntimeException;

    void saveOrUpdate(Book book) throws RuntimeException;

    void delectById(int id)throws RuntimeException;

    void delectBatch(int id)throws RuntimeException;

    Book selectById(int id)throws RuntimeException;

    List<Book> selectByFirst(String word)throws RuntimeException;
    BookEX findStatus(int id) throws RuntimeException;

    void updateStatus(int id,String status) throws  RuntimeException;

}
