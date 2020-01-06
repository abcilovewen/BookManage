package com.briup.bookmanage.bean.ex;

import java.util.Date;

public class BorrowBookEX {
    private Integer id;
    //图书id
    private Integer readerId;
    //读者id
    private Integer bookId;
    //借阅日期
    private Date bDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReaderId() {
        return readerId;
    }

    public void setReaderId(Integer readerId) {
        this.readerId = readerId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Date getbDate() {
        return bDate;
    }

    public void setbDate(Date bDate) {
        this.bDate = bDate;
    }

    public int getIfBack() {
        return ifBack;
    }

    public void setIfBack(int ifBack) {
        this.ifBack = ifBack;
    }

    //是否归还
    private int ifBack;

}
