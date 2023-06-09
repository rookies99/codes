package com.example.Dao;

import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    Integer register(User user);
}
