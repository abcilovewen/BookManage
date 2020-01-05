package com.briup.bookmanage.service.impl;

import com.briup.bookmanage.bean.Administrator;
import com.briup.bookmanage.bean.AdministratorExample;
import com.briup.bookmanage.mapper.AdministratorMapper;
import com.briup.bookmanage.service.IAdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdministratorServiceImpl implements IAdministratorService {
    @Autowired
    private AdministratorMapper administratorMapper;


    @Override
    public List<Administrator> findAll() throws RuntimeException {
        AdministratorExample administratorExample=new AdministratorExample();
        List<Administrator>list=administratorMapper.selectByExample(administratorExample);
        return list;
    }

    @Override
    public void saveOrUpdate(Administrator administrator) throws RuntimeException {
        if (administrator==null){
            throw new RuntimeException("参数为空");
        }
        if (administrator.getId()==null){
            administratorMapper.insert(administrator);
        }else {
            administratorMapper.updateByPrimaryKey(administrator);
        }
    }

    @Override
    public void delectById(int id) throws RuntimeException {
        administratorMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void delectBatch(int id) throws RuntimeException {
       administratorMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Administrator selectById(int id) throws RuntimeException {
        Administrator administrator=administratorMapper.selectByPrimaryKey(id);
        return administrator;
    }
}
