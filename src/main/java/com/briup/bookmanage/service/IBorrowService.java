package com.briup.bookmanage.service;

import com.briup.bookmanage.bean.Borrow;
import com.briup.bookmanage.bean.ex.BackBook;
import com.briup.bookmanage.bean.ex.BorrowBook;
import com.briup.bookmanage.bean.ex.BorrowEX;

import java.util.List;

public interface IBorrowService {
    List<BorrowEX> findAll() throws RuntimeException;

    List<BorrowEX> search(String keys,String word) throws RuntimeException;

    void deleteById(int id) throws RuntimeException;
    //借书
    //void borrow(Borrow borrow)throws RuntimeException;
    void borrow(BorrowBook borrow)throws RuntimeException;

    //还书
    void back(BackBook book)throws RuntimeException;

    BorrowEX findBdate(int id) throws RuntimeException;
    void fine(int id,Double fine) throws  RuntimeException;
}
