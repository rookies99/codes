package com.example.entity2;


import java.sql.Timestamp;

public class User {

  private long id;
  private String nickname;
  private String username;
  private String gender;
  private String password;
  private String email;
  private String mobile;
  private String location;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;

  public User() {
  }

  public User(long id, String nickname, String username, String gender, String password, String email, String mobile, String location, Timestamp createdAt, Timestamp updatedAt) {
    this.id = id;
    this.nickname = nickname;
    this.username = username;
    this.gender = gender;
    this.password = password;
    this.email = email;
    this.mobile = mobile;
    this.location = location;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
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


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  public java.sql.Timestamp getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }


  public java.sql.Timestamp getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", nickname='" + nickname + '\'' +
            ", username='" + username + '\'' +
            ", gender='" + gender + '\'' +
            ", password='" + password + '\'' +
            ", email='" + email + '\'' +
            ", mobile='" + mobile + '\'' +
            ", location='" + location + '\'' +
            ", createdAt=" + createdAt +
            ", updatedAt=" + updatedAt +
            '}';
  }
}
