package com.ziming.book.service.impl;

import com.gitee.fastmybatis.core.query.Query;
import com.ziming.book.entity.Book;
import com.ziming.book.entity.Borrow;
import com.ziming.book.mapper.BookMapper;
import com.ziming.book.mapper.BorrowMapper;
import com.ziming.book.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowServiceImpl implements BorrowService {

    @Autowired
    BorrowMapper borrowMapper;

    @Override
    public Borrow selectBorrowById(String jsNumber) {
        return borrowMapper.getByColumn("jsNumber", jsNumber);
    }

    @Override
    public List<Borrow> selectBorrowList() {
        return borrowMapper.list(new Query());
    }

    @Override
    public int insertBorrow(Borrow borrow) {
        return borrowMapper.save(borrow);
    }

    @Override
    public int deleteBorrow(String jsNumber) {
        return borrowMapper.deleteByQuery(new Query().addParam("jsNumber", jsNumber));
    }

    @Override
    public int updateBorrow(Borrow borrow) {
        return borrowMapper.update(borrow);
    }
}
