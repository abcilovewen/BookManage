package com.briup.bookmanage.bean.ex;

import java.util.Date;

public class BackBookEX {
    private Integer id;

    private Integer readerId;

    private Integer bookId;

    private Date rDate;

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

    public int getIfBack() {
        return ifBack;
    }

    public void setIfBack(int ifBack) {
        this.ifBack = ifBack;
    }

    private int ifBack;

}
