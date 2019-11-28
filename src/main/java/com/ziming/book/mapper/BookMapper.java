package com.ziming.book.mapper;

import com.gitee.fastmybatis.core.mapper.CrudMapper;

import com.ziming.book.entity.Book;
import org.springframework.stereotype.Component;


/**
 * @author ${param.author}
 */
@Component
public interface BookMapper extends CrudMapper<Book, Integer> {
}
