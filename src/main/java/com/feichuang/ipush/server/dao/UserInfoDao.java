package com.feichuang.ipush.server.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import tk.mybatis.mapper.common.Mapper;

import com.feichuang.ipush.server.common.model.UserInfo;

public interface UserInfoDao extends Mapper<UserInfo> {

    @Select("select * from user_info where id=#{userId} limit 1 ")
    public UserInfo getByUserId(@Param("userId") int userId);

    @Select("select * from user_info where phone=#{phone} limit 1 ")
    public UserInfo getByPhone(@Param("phone") String phone);

    @Insert("insert into user_info(pwd,sex,position,"
        + "region,experience,eduLevel,realName," + "email,status,phone)"
        + " values(#{pwd},#{sex},#{position},"
        + "#{region},#{experience},#{eduLevel},#{realName},"
        + "#{email},#{status},#{phone})")
    public int initBasicInfo(UserInfo userInfo);

}
