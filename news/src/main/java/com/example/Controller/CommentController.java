package com.example.Controller;

import com.example.entity.HotNews;
import com.example.service.CommentService;
import com.example.service.HotNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    // 获取热点事件列表
    @PutMapping("/addComment")
    public int addComment(int hotNewsId, String content) {
        return commentService.addComment(hotNewsId,content);
    }


}
