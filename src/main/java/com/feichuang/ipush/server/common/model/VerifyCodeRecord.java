package com.feichuang.ipush.server.common.model;

import java.util.Date;

/**
 * 短信验证码记录
 *
 * @author junze
 */
public class VerifyCodeRecord extends BaseObject {

    private int id;
    private int userId;
    private String phone; //手机号
    private String verifyCode;
    private int type;//验证码类型(注册，修改密码等)
    public static int TYPE_REG = 1;

    private int status;//创建状态 0, 验证通过 1,验证失败 2
    public static int STATUS_CREATE = 0;
    public static int STATUS_PASSED = 1;
    public static int STATUS_FAIL = 2;

    private Date expireTime;

    private Date createTime;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getVerifyCode() {
        return this.verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

}
