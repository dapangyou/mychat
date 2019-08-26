package com.hujia.utils;

import java.util.Map;

/**
 * 封装返回值的类
 */
public class ResponseObject {

    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    private String ok;	// 不使用

    public static ResponseObject build(Integer status, String msg, Object data) {
        return new ResponseObject(status, msg, data);
    }

    public static ResponseObject ok(Object data) {
        return new ResponseObject(data);
    }

    public static ResponseObject ok() {
        return new ResponseObject(null);
    }

    public static ResponseObject errorMsg(String msg) {
        return new ResponseObject(500, msg, null);
    }

    public static ResponseObject errorMap(Object data) {
        return new ResponseObject(501, "error", data);
    }

    public static ResponseObject errorTokenMsg(String msg) {
        return new ResponseObject(502, msg, null);
    }

    public static ResponseObject errorException(String msg) {
        return new ResponseObject(555, msg, null);
    }

    public ResponseObject() {

    }

//    public static LeeJSONResult build(Integer status, String msg) {
//        return new LeeJSONResult(status, msg, null);
//    }

    public ResponseObject(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public ResponseObject(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Boolean isOK() {
        return this.status == 200;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }
}
