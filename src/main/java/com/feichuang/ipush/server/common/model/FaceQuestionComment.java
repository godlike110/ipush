package com.feichuang.ipush.server.common.model;

import java.util.Date;

/**
 * 面试题评论
 *
 * @author junze
 */
public class FaceQuestionComment extends BaseObject {

    private int id;

    private int questionId; // 面试题帖子id

    private int replayId;// 回复Id

    private String content; // 内容

    private int userId;

    private String userName;

    private Date createTime;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuestionId() {
        return this.questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getReplayId() {
        return this.replayId;
    }

    public void setReplayId(int replayId) {
        this.replayId = replayId;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
