package com.briup.bookmanage.service;

import com.briup.bookmanage.bean.Borrow;

import java.util.List;

public interface IBorrowService {
    List<Borrow> findAll() throws RuntimeException;
}
