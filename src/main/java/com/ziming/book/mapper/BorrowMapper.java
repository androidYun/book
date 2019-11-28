package com.ziming.book.mapper;

import com.gitee.fastmybatis.core.mapper.CrudMapper;

import com.ziming.book.entity.Borrow;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @author ${param.author}
 */
@Component
public interface BorrowMapper extends CrudMapper<Borrow, String> {

}
