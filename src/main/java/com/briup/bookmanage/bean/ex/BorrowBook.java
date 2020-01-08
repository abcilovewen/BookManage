package com.briup.bookmanage.bean.ex;

import java.util.Date;

public class BorrowBook {
    private Integer id;

    private Integer readerId;

    private Integer bookId;

    private Date bDate;

    private Byte ifback;

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

    public Byte getIfback() {
        return ifback;
    }

    public void setIfback(Byte ifback) {
        this.ifback = ifback;
    }

}
