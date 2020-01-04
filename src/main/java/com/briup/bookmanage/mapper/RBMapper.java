package com.briup.bookmanage.mapper;

import com.briup.bookmanage.bean.RB;
import com.briup.bookmanage.bean.RBExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RBMapper {
    long countByExample(RBExample example);

    int deleteByExample(RBExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RB record);

    int insertSelective(RB record);

    List<RB> selectByExample(RBExample example);

    RB selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RB record, @Param("example") RBExample example);

    int updateByExample(@Param("record") RB record, @Param("example") RBExample example);

    int updateByPrimaryKeySelective(RB record);

    int updateByPrimaryKey(RB record);
}