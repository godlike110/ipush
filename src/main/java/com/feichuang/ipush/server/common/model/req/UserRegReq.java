package com.feichuang.ipush.server.common.model.req;

import com.feichuang.ipush.server.common.model.BaseObject;

/**
 * 用户注册请求
 *
 * @author junze
 */
public class UserRegReq extends BaseObject {

    private String phone;
    private String verifyCode;
    private String pwd;

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getVerifyCode() {
        return this.verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

}
