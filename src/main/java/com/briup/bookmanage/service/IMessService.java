package com.briup.bookmanage.service;

import com.briup.bookmanage.bean.Mess;

import java.util.List;

public interface IMessService {
    List<Mess> findAll() throws RuntimeException;

    void saveOrUpdate(Mess mess) throws RuntimeException;

    void delectById(int id)throws RuntimeException;

}
