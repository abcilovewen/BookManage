package com.briup.bookmanage.bean;

import java.io.Serializable;

public class Reader implements Serializable {
    private Integer id;

    private String sex;

    private Integer age;

    private String name;

    private Integer readerTypeid;

    private static final long serialVersionUID = 1L;

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
        this.sex = sex == null ? null : sex.trim();
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
        this.name = name == null ? null : name.trim();
    }

    public Integer getReaderTypeid() {
        return readerTypeid;
    }

    public void setReaderTypeid(Integer readerTypeid) {
        this.readerTypeid = readerTypeid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", name=").append(name);
        sb.append(", readerTypeid=").append(readerTypeid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}