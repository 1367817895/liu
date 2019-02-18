package com.example.x.liuqingsong0218.model.bean;

/**
 * @Auther: 刘青松
 * @Date: 2019/2/18 09:39:26
 * @Description:
 */
public class JavaBean {
    private Integer img;
    private String name;

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JavaBean(Integer img, String name) {
        this.img = img;
        this.name = name;
    }
}


