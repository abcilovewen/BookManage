package com.briup.bookmanage.mapper.ex;

import com.briup.bookmanage.bean.Borrow;
import com.briup.bookmanage.bean.ex.BackBook;
import com.briup.bookmanage.bean.ex.BorrowEX;

import javax.xml.crypto.Data;

public interface BackBookMapper {
    int back(BackBook borrow);
}
