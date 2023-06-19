package com.example.Dao;

import com.example.entity2.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    Integer register(User user);

    Integer checkUserName(String username);

    Integer checkEmail(String email);

    Integer checkMobile(String mobile);

    User login(@Param("username") String username, @Param("password") String password);
}
