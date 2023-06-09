package com.example.Controller;

import com.example.entity2.HotNews;
import com.example.service.HotNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotNews")
public class HotNewsController {

    @Autowired
    private HotNewsService hotNewsService;

//    // 获取热点事件列表
//    @GetMapping("/getAll")
//    public List<HotNews> getAll() {
//        return hotNewsService.getAll();
//    }

    // 模糊查询查询事件
    @GetMapping("/search")
    public List<HotNews> getHotNewsByTitle(String title, int offset, int pageSize, String desc) {
        return hotNewsService.getHotNewsByTitle(title, offset, pageSize,desc);
    }

    // 获取联表数据
    @GetMapping("/getHotNewsAndCommentById")
    public List<HotNews> getHotNewsAndCommentById(Integer id) {
        return hotNewsService.getHotNewsAndCommentById(id);
    }


    // 获取总记录数
    @GetMapping("/getCount")
    public int countByTitle(String title) {
        return hotNewsService.countByTitle(title);
    }

}
