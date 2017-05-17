package com.feichuang.ipush.server.common.model;

import java.util.Date;

/**
 * 项目经历
 *
 * @author junze
 */
public class ProjectExpirence extends BaseObject {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private int userId;

    private String duty; //项目职责

    private Date startTime;//开始时间

    private Date endTime; //结束时间

    private String projectLink;//项目链接

    private String projectDesc;//项目描述

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDuty() {
        return this.duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
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

    public String getProjectLink() {
        return this.projectLink;
    }

    public void setProjectLink(String projectLink) {
        this.projectLink = projectLink;
    }

    public String getProjectDesc() {
        return this.projectDesc;
    }

    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
    }

}
