package com.briup.bookmanage.bean.ex;

import com.briup.bookmanage.bean.ReaderType;

public class ReaderEX {
    private Integer id;

    private String sex;

    private Integer age;

    private String name;


    private ReaderType readerType;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public ReaderType getReaderType() {
        return readerType;
    }

    public void setReaderType(ReaderType readerType) {
        this.readerType = readerType;
    }
}
