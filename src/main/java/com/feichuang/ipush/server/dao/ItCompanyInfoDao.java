package com.feichuang.ipush.server.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import tk.mybatis.mapper.common.Mapper;

import com.feichuang.ipush.server.common.model.ItCompanyInfo;

/**
 * Created by wenzhiwei on 17-3-14.
 */
public interface ItCompanyInfoDao extends Mapper<ItCompanyInfo> {

    @Select("select * from user where companyName=#{companyName} limit 1 ")
    public ItCompanyInfo getCompanyByName(
            @Param("companyName") String companyName);

}
