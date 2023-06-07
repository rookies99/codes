package com.example.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Comment {
    private Integer id;
    private String content;
    private Integer hot_news_id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created_at;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated_at;

    public Comment(Integer id, String content, Integer hot_news_id, Date created_at, Date updated_at) {
        this.id = id;
        this.content = content;
        this.hot_news_id = hot_news_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Comment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getHot_news_id() {
        return hot_news_id;
    }

    public void setHot_news_id(Integer hot_news_id) {
        this.hot_news_id = hot_news_id;
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
