package com.briup.bookmanage.service.impl;

import com.briup.bookmanage.bean.RoomType;
import com.briup.bookmanage.bean.RoomTypeExample;
import com.briup.bookmanage.mapper.RoomTypeMapper;
import com.briup.bookmanage.service.IRoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomTypeServiceImpl implements IRoomTypeService {
    @Autowired
    private RoomTypeMapper roomTypeMapper;
    @Override
    public List<RoomType> findAll() throws RuntimeException {
        RoomTypeExample roomExample = new RoomTypeExample();
        List<RoomType> list = roomTypeMapper.selectByExample(roomExample);
        return list;
    }

    @Override
    public void saveOrUpdate(RoomType room) throws RuntimeException {
        if (room == null) {
            throw new RuntimeException("参数为空");
        }
        if (room.getId() == null) {
            roomTypeMapper.insert(room);
        } else {
            roomTypeMapper.updateByPrimaryKey(room);
        }
    }

    @Override
    public void delectById(int id) throws RuntimeException {
        roomTypeMapper.deleteByPrimaryKey(id);

    }

    @Override
    public void delectBatch(int id) throws RuntimeException {
        roomTypeMapper.deleteByPrimaryKey(id);

    }

    @Override
    public RoomType selectById(int id) throws RuntimeException {
        RoomType room = roomTypeMapper.selectByPrimaryKey(id);
        return room;
    }
}
