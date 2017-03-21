package com.feichuang.ipush.server.common.enums;

/**
 * Created by wenzhiwei on 17-3-15.
 */
public enum  ErrorCode {

    SUCCESS(0,"success"),
    ERROR(-1,"server Unavailable!"),
    NOACCESS(301,"no access"),
    PARAMERROR(101,"param error!");



    private int code;
    private String msg;

    ErrorCode(int code,String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
