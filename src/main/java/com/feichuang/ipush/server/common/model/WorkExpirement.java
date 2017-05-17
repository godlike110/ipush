package com.feichuang.ipush.server.common.model;

/**
 * 期望工作
 *
 * @author junze
 */
public class WorkExpirement extends BaseObject {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private int userId;

    private String position;

    private String workType;// 全职或兼职

    private String city;// 期望城市

    private String salary;// 期望月薪

    private String extra;//补充说明

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWorkType() {
        return this.workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSalary() {
        return this.salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

}
