package com.ziming.book.service;

import com.ziming.book.entity.Book;

import java.util.List;

public interface BookService {
    Book selectBookById(String sno);

    List<Book> selectBookList();

    int insertBook(Book book);

    int deleteBook(String sno);

    int updateBook(Book book);


}
