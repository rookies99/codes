package com.example.service;

import com.example.entity2.Comment;

import java.util.List;

public interface CommentService {
    Integer  addComment(Comment comment);

    List<Comment> getCommentByhotNewsId(Integer hotNewsId);
}
