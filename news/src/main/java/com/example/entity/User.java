package com.example.entity;

import java.util.Date;

public class User {
    private Integer id;
    private String nickname;
    private String password;
    private String email;
    private Integer mobile;
    private String location;
    private Date created_at;
    private Date updated_at;

    public User(Integer id, String nickname, String password, String email, Integer mobile, String location, Date created_at, Date updated_at) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
        this.location = location;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}
