package com.briup.bookmanage.service;

import com.briup.bookmanage.bean.ex.BorrowEX;

import java.util.List;

public interface IBorrowService {
    List<BorrowEX> findAll() throws RuntimeException;

    List<BorrowEX> search(String keys,String word) throws RuntimeException;

    void deleteById(int id) throws RuntimeException;
    //借书
    void borrow(Borrow borrow)throws RuntimeException;
    //还书
    void back(Borrow borrow)throws RuntimeException;
}
