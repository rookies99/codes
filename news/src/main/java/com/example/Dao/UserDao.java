package com.example.Dao;

import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    Integer register(User user);

    Integer checkUserName(String username);

    Integer checkEmail(String email);

    Integer checkMobile(String mobile);

    Integer login(@Param("username") String username, @Param("password") String password);
}
