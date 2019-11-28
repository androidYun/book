package com.ziming.book.controller;

import com.ziming.book.entity.Book;
import com.ziming.book.entity.Borrow;
import com.ziming.book.entity.Student;
import com.ziming.book.service.impl.BookServiceImpl;
import com.ziming.book.service.impl.BorrowServiceImpl;
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

    @Autowired
    BookServiceImpl bookService;

    @Autowired
    BorrowServiceImpl borrowService;

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("test");
        return modelAndView;
    }

    @RequestMapping("/master")
    public ModelAndView master() {
        ModelAndView modelAndView = new ModelAndView("master");
        return modelAndView;
    }

    @RequestMapping("/login")
    public ModelAndView login(String name, String password) {
        Student student = studentService.selectStudentById(name);
        if (student == null) {
            ModelAndView modelAndView = new ModelAndView("login");
            return modelAndView;
        } else {
            List<Book> books = bookService.selectBookList();
            List<Borrow> borrows = borrowService.selectBorrowList();
            ModelAndView modelAndView = new ModelAndView("book");
            modelAndView.addObject("bookList", books);
            modelAndView.addObject("borrowList", borrows);
            System.out.println(borrows);
            return modelAndView;
        }

    }

    private Book getBook(List<Book> bookList, String bookNumber) {
        for (Book book : bookList) {
            if (book.getBookNumber() == bookNumber) {
                return book;
            }
        }
        return null;
    }

    @RequestMapping("/list")
    public ModelAndView studentList() {
        List<Student> studentList = studentService.selectStudentList();
        ModelAndView modelAndView = new ModelAndView("student");
        modelAndView.addObject("studentList", studentList);
        return modelAndView;
    }
}
