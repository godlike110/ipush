package com.feichuang.ipush.server.common.model;

/**
 * 公司点评
 * 
 * @author junze
 */
public class CompanyComment {

    private int id;
    private int companyId;
    private String companyName;//公司名称
    private String tag;//点评标签[工资，待遇，加班,前景]
    private String content;//点评内容

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

}
