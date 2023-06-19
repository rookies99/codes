package com.example.entity2;


import com.fasterxml.jackson.annotation.JsonFormat;

public class HotNews {

  private long id;
  private String title;
  private String article;
  private long numberOfSearches;
  @JsonFormat(pattern = "yyyy-MM-dd")
  private java.sql.Timestamp createdAt;
  @JsonFormat(pattern = "yyyy-MM-dd")
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getArticle() {
    return article;
  }

  public void setArticle(String article) {
    this.article = article;
  }


  public long getNumberOfSearches() {
    return numberOfSearches;
  }

  public void setNumberOfSearches(long numberOfSearches) {
    this.numberOfSearches = numberOfSearches;
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
