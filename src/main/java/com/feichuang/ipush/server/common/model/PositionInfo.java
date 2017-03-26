package com.feichuang.ipush.server.common.model;

/**
 * 职位类型
 * 
 * @author junze
 */
public class PositionInfo {

    private int id;

    private String positionName;//[Java高级工程师，测试工程师]

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPositionName() {
        return this.positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

}
