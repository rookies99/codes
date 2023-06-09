package com.example.service;

import com.example.Dao.CommentDao;
import com.example.entity2.Comment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Slf4j
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentDao commentDao;

    @Override
    public Integer addComment(Comment comment) {
        return commentDao.addComment(comment);
    }

    @Override
    public List<Comment> getCommentByhotNewsId(Integer hotNewsId) {
        return commentDao.getCommentByhotNewsId(hotNewsId);
    }
}
