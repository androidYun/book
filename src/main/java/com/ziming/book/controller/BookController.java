package com.ziming.book.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class BookController {

    @RequestMapping("/index")
    public ModelAndView listCategory() {
        System.out.println("时间");
        ModelAndView mv = new ModelAndView("hello");
        return mv;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
