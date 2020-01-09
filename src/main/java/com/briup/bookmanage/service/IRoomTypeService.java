package com.briup.bookmanage.service;

import com.briup.bookmanage.bean.Room;
import com.briup.bookmanage.bean.RoomType;

import java.util.List;

public interface IRoomTypeService {
    List<RoomType> findAll() throws RuntimeException;

    void saveOrUpdate(RoomType room) throws RuntimeException;

    void delectById(int id)throws RuntimeException;

    void delectBatch(int id)throws RuntimeException;

    RoomType selectById(int id)throws RuntimeException;
}
