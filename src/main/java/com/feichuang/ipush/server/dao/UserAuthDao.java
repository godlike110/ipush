package com.feichuang.ipush.server.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import tk.mybatis.mapper.common.Mapper;

import com.feichuang.ipush.server.common.model.UserAuth;

public interface UserAuthDao extends Mapper<UserAuth> {

    /**
     * 根据提交时间获取 提交次数
     *
     * @param userId
     * @return
     */
    @Select("select count(1) from user_auth where userId=#{userId} and createTime > #{createStartTime}  ")
    public int getTimesByCreateTime(@Param("userId") int userId,
            @Param("createStartTime") Date createStartTime);

    @Select("select * from user_auth where userId=#{userId} order by id desc limit 1  ")
    public UserAuth getLatestAuth(@Param("userId") int userId);

}
