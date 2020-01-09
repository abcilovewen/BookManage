package com.briup.bookmanage.service.impl;

import com.briup.bookmanage.bean.Room;
import com.briup.bookmanage.bean.RoomExample;
import com.briup.bookmanage.mapper.RoomMapper;
import com.briup.bookmanage.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements IRoomService {
    @Autowired
    private RoomMapper roomMapper;
    @Override
    public List<Room> findAll() throws RuntimeException {
        RoomExample roomExample = new RoomExample();
        List<Room> list = roomMapper.selectByExample(roomExample);
        return list;
    }

    @Override
    public void saveOrUpdate(Room room) throws RuntimeException {
        if (room == null) {
            throw new RuntimeException("参数为空");
        }
        if (room.getId() == null) {
            roomMapper.insert(room);
        } else {
            roomMapper.updateByPrimaryKey(room);
        }
    }

    @Override
    public void delectById(int id) throws RuntimeException {
        roomMapper.deleteByPrimaryKey(id);

    }

    @Override
    public void delectBatch(int id) throws RuntimeException {
        roomMapper.deleteByPrimaryKey(id);

    }

    @Override
    public Room selectById(int id) throws RuntimeException {
        Room room = roomMapper.selectByPrimaryKey(id);
        return room;
    }
}
