package com.example.service;

import com.example.Dao.HotNewsDao;
import com.example.entity.HotNews;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Slf4j
public class HotNewsServiceImpl implements HotNewsService{

    @Autowired
    private HotNewsDao hotNewsDao;

//    @Override
//    public List<HotNews> getAll() {
//        return hotNewsDao.getAll();
//    }

    @Override
    public List<HotNews> getHotNewsByTitle(String title, int offset, int pageSize) {
        return hotNewsDao.getHotNewsByTitle(title, offset, pageSize);
    }

    @Override
    public List<HotNews> getHotNewsAndCommentById(Integer id) {
        return hotNewsDao.getHotNewsAndCommentById(id);
    }

    @Override
    public int countByTitle(String title) {
        return hotNewsDao.countByTitle(title);
    }

}
