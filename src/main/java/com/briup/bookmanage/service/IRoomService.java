package com.briup.bookmanage.service;

import com.briup.bookmanage.bean.Room;

import java.util.List;

public interface IRoomService {
    List<Room> findAll() throws RuntimeException;

    void saveOrUpdate(Room room) throws RuntimeException;

    void delectById(int id)throws RuntimeException;

    void delectBatch(int id)throws RuntimeException;

    Room selectById(int id)throws RuntimeException;
}
