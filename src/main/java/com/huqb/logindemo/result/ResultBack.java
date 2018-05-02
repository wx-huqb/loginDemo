package com.huqb.logindemo.result;

public class ResultBack {

    private String return_code;
    private String return_msg;
    private Object data;

    private String author_name;
    private Integer author_age;
    private String author_sex;

    public String getReturn_code() {
        return return_code;
    }

    public void setReturn_code(String return_code) {
        this.return_code = return_code;
    }

    public String getReturn_msg() {
        return return_msg;
    }

    public void setReturn_msg(String return_msg) {
        this.return_msg = return_msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public Integer getAuthor_age() {
        return author_age;
    }

    public void setAuthor_age(Integer author_age) {
        this.author_age = author_age;
    }

    public String getAuthor_sex() {
        return author_sex;
    }

    public void setAuthor_sex(String author_sex) {
        this.author_sex = author_sex;
    }
}
