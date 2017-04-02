package com.feichuang.ipush.server.common.model;

/**
 * It 公司
 *
 * @author junze
 */
public class ItCompanyInfo {

    private int id;
    //id
    private int companyIndex;

    private String companyName;

    private String type;//公司类型 在线教育,O2O

    private String process;//融资进度

    private String number;//人数规模

    private String address;  //城市

    private String intro; //公司简介

    private int score;//公司评分热度

    private String homePage;//公司主页

    private String logo;//公司Logo

    private String suffixEmail; //公司邮箱后缀

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCompanyIndex() {
        return this.companyIndex;
    }

    public void setCompanyIndex(int companyIndex) {
        this.companyIndex = companyIndex;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProcess() {
        return this.process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIntro() {
        return this.intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getHomePage() {
        return this.homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getSuffixEmail() {
        return this.suffixEmail;
    }

    public void setSuffixEmail(String suffixEmail) {
        this.suffixEmail = suffixEmail;
    }

}
