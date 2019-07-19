package com.example.springbootjpa.controller;

import com.example.springbootjpa.dao.SchoolRepository;
import com.example.springbootjpa.entity.Schools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private SchoolRepository schoolRepository;

    @GetMapping("/findAll")
    public List<Schools> findAll(){
        return schoolRepository.findAll();
    }

    @PostMapping("/add")
    public Schools add(Schools schools){
        return schoolRepository.save(schools);
    }
}
