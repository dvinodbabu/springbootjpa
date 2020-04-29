package com.example.jpa.controller;

import com.example.jpa.dao.StudentDao;
import com.example.jpa.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringJpaController {
    @Autowired
    StudentDao studentDao;
    @RequestMapping("/hello")
    public String hello(){
        return "hello.jsp";
    }
    @RequestMapping("/addStudent")
    public String addStudent(StudentModel studentModel){
        studentDao.save(studentModel);
        return "hello.jsp";
    }
}
