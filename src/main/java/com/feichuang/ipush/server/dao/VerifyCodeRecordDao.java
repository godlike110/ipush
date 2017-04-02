package com.feichuang.ipush.server.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import tk.mybatis.mapper.common.Mapper;

import com.feichuang.ipush.server.common.model.VerifyCodeRecord;

public interface VerifyCodeRecordDao extends Mapper<VerifyCodeRecord> {

    @Select("select * from verify_code_record where phone=#{phone} "
            + "  and status=#{status} and type=#{type}")
    public VerifyCodeRecord getCodeRecordByPhoneAndStatusAndType(
            @Param("phone") String phone, @Param("status") int status,
            @Param("type") int type);
}
