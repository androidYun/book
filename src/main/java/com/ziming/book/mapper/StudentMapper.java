package com.ziming.book.mapper;

import com.gitee.fastmybatis.core.mapper.CrudMapper;

import com.ziming.book.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


/**
 * @author ${param.author}
 */
@Component
public interface StudentMapper extends CrudMapper<Student, String> {
}
