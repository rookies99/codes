package com.example.Controller;

import com.example.entity.Comment;
import com.example.entity.HotNews;
import com.example.service.CommentService;
import com.example.service.HotNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PutMapping("/addComment")
    public int addComment(@RequestBody Comment comment) {
        return commentService.addComment(comment);
    }

    @GetMapping("/getCommentByhotNewsId")
    public List<Comment> getCommentByhotNewsId(int hotNewsId){
        return commentService.getCommentByhotNewsId(hotNewsId);
    }
}
