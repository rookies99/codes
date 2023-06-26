package com.example.service;

import com.example.entity2.User;

public interface UserService {
    Integer register(User user);

    Integer checkUserName(String username,String id);

    Integer checkEmail(String email,String id);

    Integer checkMobile(String mobile,String id);

    User login( String username, String password);

    Integer updateUser(User user);
}
