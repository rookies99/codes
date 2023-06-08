package com.example.Dao;

import com.example.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentDao {
    Integer addComment(Comment comment);

    List<Comment> getCommentByhotNewsId(int hosNewsId);
    
}
