package com.feichuang.ipush.server.common.model;

import java.util.Date;

/**
 * 工作经历
 *
 * @author
 */
public class WorkExperience extends BaseObject {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private int id;

    private int userId;

    private String companyName;//公司名称

    private String position;// 职位

    private Date startTime;// 开始时间

    private Date endTime; //结束时间

    private String workContent;//工作内容

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

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getWorkContent() {
        return this.workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent;
    }

}
