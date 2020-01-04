package com.briup.bookmanage.mapper;

import com.briup.bookmanage.bean.ReaderType;
import com.briup.bookmanage.bean.ReaderTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReaderTypeMapper {
    long countByExample(ReaderTypeExample example);

    int deleteByExample(ReaderTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ReaderType record);

    int insertSelective(ReaderType record);

    List<ReaderType> selectByExample(ReaderTypeExample example);

    ReaderType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ReaderType record, @Param("example") ReaderTypeExample example);

    int updateByExample(@Param("record") ReaderType record, @Param("example") ReaderTypeExample example);

    int updateByPrimaryKeySelective(ReaderType record);

    int updateByPrimaryKey(ReaderType record);
}