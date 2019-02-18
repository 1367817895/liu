package com.example.x.liuqingsong0218.model.bean;

/**
 * @Auther: 刘青松
 * @Date: 2019/2/18 08:53:16
 * @Description:
 */
public class NewsBean {

    private  Integer code;
    private  Integer httpStatusCode;
    private  String msg;
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public Integer getHttpStatusCode() {
        return httpStatusCode;
    }
    public void setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public NewsBean(Integer code, Integer httpStatusCode, String msg) {
        this.code = code;
        this.httpStatusCode = httpStatusCode;
        this.msg = msg;
    }
}
