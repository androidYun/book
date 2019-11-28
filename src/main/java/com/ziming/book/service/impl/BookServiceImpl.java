package com.ziming.book.service.impl;

import com.gitee.fastmybatis.core.query.Query;
import com.ziming.book.entity.Book;
import com.ziming.book.mapper.BookMapper;
import com.ziming.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    @Override
    public Book selectBookById(String sno) {
        return bookMapper.getByColumn("book_number", sno);
    }

    @Override
    public List<Book> selectBookList() {
        return bookMapper.list(new Query());
    }

    @Override
    public int insertBook(Book Book) {
        return bookMapper.save(Book);
    }

    @Override
    public int deleteBook(String bookNumber) {
        Book book_number = bookMapper.getByColumn("book_number", bookNumber);
        return bookMapper.delete(book_number);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.update(book);
    }
}
