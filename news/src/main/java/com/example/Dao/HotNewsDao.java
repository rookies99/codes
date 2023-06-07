package com.example.Dao;

import com.example.entity.HotNews;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HotNewsDao {
    List<HotNews> getAll();

    List<HotNews> getHotNewsByTitle(String title);

    List<HotNews> getHotNewsAndCommentById(Integer id);

}
