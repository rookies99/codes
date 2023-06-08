package com.example.Dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentDao {
    int addComment(int hotNewsId, String content);
    
}
