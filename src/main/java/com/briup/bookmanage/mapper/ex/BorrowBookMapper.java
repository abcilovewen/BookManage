package com.briup.bookmanage.mapper.ex;

import com.briup.bookmanage.bean.ex.BorrowBook;

public interface BorrowBookMapper {
    int borrow(BorrowBook borrow);
    int back(BorrowBook borrow);

}
