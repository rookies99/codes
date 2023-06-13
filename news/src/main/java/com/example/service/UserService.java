package com.example.service;

import com.example.entity.User;

public interface UserService {
    Integer register(User user);

    Integer checkUserName(String username);

    Integer checkEmail(String email);

    Integer checkMobile(String mobile);
}
