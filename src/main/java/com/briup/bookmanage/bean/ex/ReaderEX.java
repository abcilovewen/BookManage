package com.briup.bookmanage.bean.ex;

import com.briup.bookmanage.bean.ReaderType;
import io.swagger.annotations.ApiModelProperty;

public class ReaderEX {
    private Integer id;

    private String sex;

    private Integer age;

    private String name;

    private Integer readerType_Id;

    @ApiModelProperty(hidden = true)
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

    public Integer getReaderType_Id() {
        return readerType_Id;
    }

    public void setReaderType_Id(Integer readerType_Id) {
        this.readerType_Id = readerType_Id;
    }
}
