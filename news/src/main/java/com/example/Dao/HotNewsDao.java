package com.example.Dao;

import com.example.entity2.HotNews;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HotNewsDao {
//    List<HotNews> getAll();

    List<HotNews> getHotNewsByTitle(@Param("title") String title,
                                    @Param("offset") int offset,
                                    @Param("pageSize") int pageSize,
                                    @Param("desc") String desc);

    List<HotNews> getHotNewsAndCommentById(Integer id);

    int countByTitle(@Param("title") String title);


}
