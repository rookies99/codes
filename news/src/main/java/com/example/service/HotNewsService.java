package com.example.service;

import com.example.entity.HotNews;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HotNewsService {
//    List<HotNews> getAll();

    List<HotNews> getHotNewsByTitle(String title, int offset, int pageSize);

    List<HotNews> getHotNewsAndCommentById(Integer id);

    int countByTitle(@Param("title") String title);
}
