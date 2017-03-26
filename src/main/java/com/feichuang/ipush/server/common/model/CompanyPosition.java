package com.feichuang.ipush.server.common.model;

/**
 * 内推职位
 *
 * @author junze
 */
public class CompanyPosition {

    private int id;

    private int companyId;

    private String companyName;

    private int innerPushers;//内推人数

    private String title;

    private String address; //公司地址[具体的]

    private String region;// 城市名称:北京

    private String salary;// 城市名称:待遇:10K-20K,固定选择

    private String exprience;// 工作经验:3年

    private String eduLevel;// 学历要求 [固定选择]

    private String content;// 职位描述

    private String requirement;// 要求

    private int status;// 状态,1 审核中,2 审核通过 3 审核不通过

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getInnerPushers() {
        return this.innerPushers;
    }

    public void setInnerPushers(int innerPushers) {
        this.innerPushers = innerPushers;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getExprience() {
        return this.exprience;
    }

    public void setExprience(String exprience) {
        this.exprience = exprience;
    }

    public String getEduLevel() {
        return this.eduLevel;
    }

    public void setEduLevel(String eduLevel) {
        this.eduLevel = eduLevel;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRequirement() {
        return this.requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
