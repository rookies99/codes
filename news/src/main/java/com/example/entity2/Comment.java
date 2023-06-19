package com.example.entity2;


import com.fasterxml.jackson.annotation.JsonFormat;

public class Comment {

  private long id;
  private long userId;
  private String content;
  private long hotNewsId;
  @JsonFormat(pattern = "yyyy-MM-dd")
  private java.sql.Timestamp createdAt;
  @JsonFormat(pattern = "yyyy-MM-dd")
  private java.sql.Timestamp updatedAt;
  private User user;

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public long getHotNewsId() {
    return hotNewsId;
  }

  public void setHotNewsId(long hotNewsId) {
    this.hotNewsId = hotNewsId;
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

}
