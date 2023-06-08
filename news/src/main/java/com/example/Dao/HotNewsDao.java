package com.example.Dao;

import com.example.entity.HotNews;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HotNewsDao {
//    List<HotNews> getAll();

    List<HotNews> getHotNewsByTitle(@Param("title") String title, @Param("offset") int offset, @Param("pageSize") int pageSize);

    List<HotNews> getHotNewsAndCommentById(Integer id);

    int countByTitle(@Param("title") String title);

}
