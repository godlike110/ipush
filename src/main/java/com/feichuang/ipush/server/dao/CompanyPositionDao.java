package com.feichuang.ipush.server.dao;

import org.apache.ibatis.annotations.Insert;

import tk.mybatis.mapper.common.Mapper;

import com.feichuang.ipush.server.common.model.CompanyPosition;

public interface CompanyPositionDao extends Mapper<CompanyPosition> {

    @Insert("insert into company_position(publisher,companyId,"
            + "companyName,innerPushers,title,address,region,salary,exprience,"
            + "eduLevel,content,requirement,status) "
            + " vallues (#{publisher},#{companyId},#{companyName},#{innerPushers},"
            + "#{title},#{address},#{region},#{salary},#{exprience},"
            + "#{eduLevel},#{content},#{requirement},#{status})")
    public int save(CompanyPosition position);

}
