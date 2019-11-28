package com.ziming.book.controller;

import com.ziming.book.entity.Master;
import com.ziming.book.service.impl.BookServiceImpl;
import com.ziming.book.service.impl.MasterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/master")
@RestController
public class MasterController {

    @Autowired
    MasterServiceImpl masterService;

    @Autowired
    BookServiceImpl bookService;

    @RequestMapping("/login")
    public ModelAndView login(String name, String password) {
        Master master = masterService.selectMasterById(name);
        if (master == null) {
            ModelAndView modelAndView = new ModelAndView("login");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("master");
            modelAndView.addObject("bookList", bookService.selectBookList());
            return modelAndView;
        }
    }
}
