package com.ziming.book.service;

import com.ziming.book.entity.Borrow;

import java.util.List;

public interface BorrowService {
    Borrow selectBorrowById(String jsNumber);

    List<Borrow> selectBorrowList();

    int insertBorrow(Borrow borrow);

    int deleteBorrow(String jsNumber);

    int updateBorrow(Borrow borrow);


}
