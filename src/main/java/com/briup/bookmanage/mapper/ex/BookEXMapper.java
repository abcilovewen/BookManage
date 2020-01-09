package com.briup.bookmanage.mapper.ex;

import com.briup.bookmanage.bean.ex.BookEX;

public interface BookEXMapper {
    BookEX selectStatus(int id);
    int updateStatus(int id,String status);
}
