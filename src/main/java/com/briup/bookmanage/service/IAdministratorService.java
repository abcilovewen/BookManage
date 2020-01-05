package com.briup.bookmanage.service;

import com.briup.bookmanage.bean.Administrator;

import java.util.List;

public interface IAdministratorService {
    List<Administrator> findAll() throws RuntimeException;

    void saveOrUpdate(Administrator administrator) throws RuntimeException;

    void delectById(int id)throws RuntimeException;

    void delectBatch(int id)throws RuntimeException;

    Administrator selectById(int id)throws RuntimeException;
}
