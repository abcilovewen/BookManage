package com.briup.bookmanage.mapper;

import com.briup.bookmanage.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User findByUsername(@Param("username") String username);
    User findUserById(String userId);
}
