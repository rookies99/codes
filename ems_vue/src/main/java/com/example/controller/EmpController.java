package com.example.controller;

import com.example.entity.Emp;
import com.example.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("emp")
@CrossOrigin
public class EmpController {

    @Resource
    private EmpService empService;

    @GetMapping("findAll")
    public List<Emp> findAll() {
        return empService.findAll();
    }
}
