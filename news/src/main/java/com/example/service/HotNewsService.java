package com.example.service;

import com.example.entity.HotNews;

import java.util.List;

public interface HotNewsService {
    List<HotNews> getAll();

    List<HotNews> getHotNewsByTitle(String title);

    List<HotNews> getHotNewsAndCommentById(Integer id);
}
