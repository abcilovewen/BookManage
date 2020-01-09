package com.briup.bookmanage.mapper;

import com.briup.bookmanage.bean.Mess;
import com.briup.bookmanage.bean.MessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessMapper {
    long countByExample(MessExample example);

    int deleteByExample(MessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mess record);

    int insertSelective(Mess record);

    List<Mess> selectByExample(MessExample example);

    Mess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Mess record, @Param("example") MessExample example);

    int updateByExample(@Param("record") Mess record, @Param("example") MessExample example);

    int updateByPrimaryKeySelective(Mess record);

    int updateByPrimaryKey(Mess record);
}