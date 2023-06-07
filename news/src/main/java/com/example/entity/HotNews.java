package com.example.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class HotNews {
    private Integer id;
    private String title;
    private String article;
    private Integer numberOfSearches;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date created_at;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updated_at;
    private Comment comment;

    public HotNews(Integer id, String title, String article, Integer numberOfSearches, Date created_at, Date updated_at, Comment comment) {
        this.id = id;
        this.title = title;
        this.article = article;
        this.numberOfSearches = numberOfSearches;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.comment = comment;
    }

    public HotNews() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getNumberOfSearches() {
        return numberOfSearches;
    }

    public void setNumberOfSearches(Integer numberOfSearches) {
        this.numberOfSearches = numberOfSearches;
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

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}
