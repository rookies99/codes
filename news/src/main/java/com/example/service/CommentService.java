package com.example.service;

import com.example.entity.Comment;

import java.util.List;

public interface CommentService {
    Integer  addComment(Comment comment);

    List<Comment> getCommentByhotNewsId(int hosNewsId);
}
