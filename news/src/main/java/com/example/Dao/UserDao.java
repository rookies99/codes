package com.example.Dao;

import com.example.entity2.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    Integer register(User user);

    Integer checkUserName(@Param("username") String username,@Param("id") String  id);

    Integer checkEmail(@Param("email") String email,@Param("id") String  id);

    Integer checkMobile(@Param("mobile") String mobile,@Param("id") String  id);
    
    Integer updateUser(User user);

    User login(@Param("username") String username, @Param("password") String password);

}
