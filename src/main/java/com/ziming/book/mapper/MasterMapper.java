package com.ziming.book.mapper;

import com.gitee.fastmybatis.core.mapper.CrudMapper;

import com.ziming.book.entity.Master;
import org.springframework.stereotype.Component;


/**
 * @author ${param.author}
 */
@Component
public interface MasterMapper extends CrudMapper<Master, Integer> {
}
