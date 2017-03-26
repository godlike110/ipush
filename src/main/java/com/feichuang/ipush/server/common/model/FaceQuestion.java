package com.feichuang.ipush.server.common.model;

import java.util.Date;

/**
 * 面试题
 *
 * @author junze
 */
public class FaceQuestion {

    private int id;

    private int userId;

    private String userName;

    private String tag; // 标签

    private String content;//内容

    private int discussCount;//评论数

    private Date createTime;// 创建时间

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

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getDiscussCount() {
        return this.discussCount;
    }

    public void setDiscussCount(int discussCount) {
        this.discussCount = discussCount;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
