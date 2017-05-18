package com.feichuang.ipush.server.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import tk.mybatis.mapper.common.Mapper;

import com.feichuang.ipush.server.common.model.UserInfo;

public interface UserInfoDao extends Mapper<UserInfo> {

    @Select("select * from user_info where id=#{userId} limit 1 ")
    public UserInfo getByUserId(@Param("userId") int userId);

    @Select("select id,pwd,sex,position,region,experience,eduLevel,realName,"
            + "email,status,phone  from user_info where id=#{userId} limit 1 ")
    public UserInfo getUserBasicByUserId(@Param("userId") int userId);

    @Select("select id,workExperiences,studyExperiences,workExpirement,"
            + " projectExperiences  from user_info where id=#{userId} limit 1 ")
    public UserInfo getUserComplexInfoByUserId(@Param("userId") int userId);

    @Select("select * from user_info where phone=#{phone} limit 1 ")
    public UserInfo getByPhone(@Param("phone") String phone);

    @Insert("insert into user_info(pwd,sex,position,"
            + "region,experience,eduLevel,realName," + "email,status,phone)"
            + " values(#{pwd},#{sex},#{position},"
            + "#{region},#{experience},#{eduLevel},#{realName},"
            + "#{email},#{status},#{phone})")
    public int initBasicInfo(UserInfo userInfo);

    @Update("update user_info set workExperiences=#{content} where userId=#{userId} ")
    public int updateWorkExperience(@Param("userId") int userId,
            @Param("content") String content);

    @Update("update user_info set studyExperiences=#{content} where userId=#{userId} ")
    public int updateStudyExperience(@Param("userId") int userId,
            @Param("content") String content);

    @Update("update user_info set projectExperiences=#{content} where userId=#{userId} ")
    public int updateProjectExperience(@Param("userId") int userId,
            @Param("content") String content);

    @Update("update user_info set workExpirement=#{content} where userId=#{userId} ")
    public int updateWorkExpirement(@Param("userId") int userId,
            @Param("content") String content);

}
