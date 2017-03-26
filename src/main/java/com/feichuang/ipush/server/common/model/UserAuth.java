package com.feichuang.ipush.server.common.model;

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

    private int status; // 1 审核中 2审核成功 3审核失败

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

}
