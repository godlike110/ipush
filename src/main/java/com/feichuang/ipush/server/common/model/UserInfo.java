package com.feichuang.ipush.server.common.model;

import java.util.Date;

/**
 * 用户
 *
 * @author junze
 */
public class UserInfo {

    private int id;

    private String phone;

    private String pwd;//用户密码(md5)

    private String activePwd; //(动态密码明文)
    private int sex; // 用户性别 1 女 2男
    private String position; // 职位
    private String region; // 城市名称:北京
    private String salary; // 待遇:10K-20K,固定选择
    private String experience; // 工作年限

    private String eduLevel; // 学历
    private String realName; // 真实姓名
    private String nickName; // 别名
    private String email; // 邮箱
    private Date birthday;//出生日期

    private int status;//1 创建中，2 已认证(已经认证的可以重新认证，因为换工作之类的),3.认证失败
    private int active;//活跃度 (有内推职位，并且经常 登录系统,进行操作)

    private String loginTime;//最近登录时间

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getActivePwd() {
        return this.activePwd;
    }

    public void setActivePwd(String activePwd) {
        this.activePwd = activePwd;
    }

    public int getSex() {
        return this.sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSalary() {
        return this.salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getExperience() {
        return this.experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getEduLevel() {
        return this.eduLevel;
    }

    public void setEduLevel(String eduLevel) {
        this.eduLevel = eduLevel;
    }

    public String getRealName() {
        return this.realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getActive() {
        return this.active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getLoginTime() {
        return this.loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

}
