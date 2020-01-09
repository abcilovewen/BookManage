package com.briup.bookmanage.bean.ex;

import java.util.Date;

public class BackBook {
    private Integer id;

    private Integer readerId;

    private Integer bookId;

    private Date rDate;

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

    public Date getrDate() {
        return rDate;
    }

    public void setrDate(Date rDate) {
        this.rDate = rDate;
    }

    public Byte getIfback() {
        return ifback;
    }

    public void setIfback(Byte ifback) {
        this.ifback = ifback;
    }


}
