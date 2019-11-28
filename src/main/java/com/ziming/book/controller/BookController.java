package com.ziming.book.controller;

import com.ziming.book.entity.Book;
import com.ziming.book.entity.Borrow;
import com.ziming.book.service.impl.BookServiceImpl;
import com.ziming.book.service.impl.BorrowServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/book")
public class BookController {


    @Autowired
    BorrowServiceImpl borrowService;

    @Autowired
    BookServiceImpl bookService;


    @RequestMapping("/borrow")
    public ModelAndView borrow(String bookNumber) {
        Borrow borrow = new Borrow();
        borrow.setBookNumber(
                bookNumber
        );
        borrow.setJsNumber(String.valueOf(System.currentTimeMillis()));
        borrow.setBDate(new Date(System.currentTimeMillis()));
        borrowService.insertBorrow(borrow);
        ModelAndView modelAndView = new ModelAndView("book");
        List<Book> books = bookService.selectBookList();
        modelAndView.addObject("bookList", books);
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addBook(Book book) {
        book.setBookNumber(String.valueOf(System.currentTimeMillis()));
        bookService.insertBook(book);
        List<Book> books = bookService.selectBookList();
        ModelAndView modelAndView = new ModelAndView("master");
        modelAndView.addObject("bookList", books);
        return modelAndView;
    }
    @RequestMapping(value = "/delete")
    public ModelAndView deleteBook(String  bookNumber) {
        bookService.deleteBook(bookNumber);
        ModelAndView modelAndView = new ModelAndView("master");
        modelAndView.addObject("bookList", bookService.selectBookList());
        return modelAndView;
    }
}
