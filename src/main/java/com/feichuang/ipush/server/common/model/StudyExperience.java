package com.feichuang.ipush.server.common.model;

import java.util.Date;

/**
 * 学习经历
 *
 * @author junze
 */
public class StudyExperience extends BaseObject {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private int id;

    private int userId;

    private String schoolName; //学校名称

    private String major; // 专业

    private Date graduateTime; //毕业日期

    private String eduLevel; //学历

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

    public String getSchoolName() {
        return this.schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Date getGraduateTime() {
        return this.graduateTime;
    }

    public void setGraduateTime(Date graduateTime) {
        this.graduateTime = graduateTime;
    }

    public String getEduLevel() {
        return this.eduLevel;
    }

    public void setEduLevel(String eduLevel) {
        this.eduLevel = eduLevel;
    }

}
