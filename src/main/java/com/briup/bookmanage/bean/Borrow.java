package com.briup.bookmanage.bean;

import java.io.Serializable;
import java.util.Date;

public class Borrow implements Serializable {
    private Integer id;

    private Integer readerId;

    private Integer bookId;

    private Date bDate;

    private Date rDate;

    private Integer ifback;

    private Double fine;

    private static final long serialVersionUID = 1L;

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

    public Date getrDate() {
        return rDate;
    }

    public void setrDate(Date rDate) {
        this.rDate = rDate;
    }

    public Integer getIfback() {
        return ifback;
    }

    public void setIfback(Integer ifback) {
        this.ifback = ifback;
    }

    public Double getFine() {
        return fine;
    }

    public void setFine(Double fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", readerId=").append(readerId);
        sb.append(", bookId=").append(bookId);
        sb.append(", bDate=").append(bDate);
        sb.append(", rDate=").append(rDate);
        sb.append(", ifback=").append(ifback);
        sb.append(", fine=").append(fine);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}