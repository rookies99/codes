package com.example.Dao;

import com.example.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentDao {
    Integer addComment(Comment comment);
    
}
