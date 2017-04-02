package com.feichuang.ipush.server.common.model;

import java.util.Date;

/**
 * 用户审核记录
 *
 * @author junze
 */
public class UserAuth {

    private int id;

    private int userId;

    private String userName; //名称

    private String authPhoto; // 图片地址

    private String email; // 公司邮箱

    private int companyId;//公司Id

    private String companyName;//公司名称

    private int status; // 1 审核中 2审核成功 3审核失败

    private Date createTime;

    private Date authTime;//审核时间

    private String remark;//审核意见

    public static int STATUS_PROCESSING = 1;
    public static int STATUS_SUCCESS = 2;
    public static int STATUS_FAIL = 3;

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

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAuthPhoto() {
        return this.authPhoto;
    }

    public void setAuthPhoto(String authPhoto) {
        this.authPhoto = authPhoto;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getAuthTime() {
        return this.authTime;
    }

    public void setAuthTime(Date authTime) {
        this.authTime = authTime;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
