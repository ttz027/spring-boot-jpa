package com.example.springbootjpa.controller;

import com.example.springbootjpa.dao.TeacherRepository;
import com.example.springbootjpa.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping("/findAll")
    public List<Teacher> findAll(){
        return teacherRepository.findAll();
    }
}
