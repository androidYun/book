package com.ziming.book.controller;

import com.ziming.book.entity.Student;
import com.ziming.book.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @RequestMapping("/login")
    public ModelAndView login(String sno, String password) {
        Student student = studentService.selectStudentById(sno);
        ModelAndView modelAndView = new ModelAndView("");
        return modelAndView;
    }

    @RequestMapping("/list")
    public ModelAndView studentList() {
        List<Student> studentList = studentService.selectStudentList();
        ModelAndView modelAndView = new ModelAndView("student");
        modelAndView.addObject("studentList", studentList);
        return modelAndView;
    }
}
