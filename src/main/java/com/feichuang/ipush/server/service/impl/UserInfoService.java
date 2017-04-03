package com.feichuang.ipush.server.service.impl;

import java.util.Date;
import java.util.Random;

import org.apache.commons.lang.time.DateUtils;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feichuang.ipush.server.common.model.Result;
import com.feichuang.ipush.server.common.model.UserInfo;
import com.feichuang.ipush.server.common.model.VerifyCodeRecord;
import com.feichuang.ipush.server.common.model.req.UserInfoReq;
import com.feichuang.ipush.server.dao.UserInfoDao;
import com.feichuang.ipush.server.dao.VerifyCodeRecordDao;

@Service
public class UserInfoService {

    @Autowired
    private VerifyCodeRecordDao verifyCodeRecordDao;

    @Autowired
    private UserInfoDao userInfoDao;

    //发送注册短信验证码
    public Result<String> sendRegMsg(String phone, String verifyCode) {
        Result<String> result = new Result<>();
        UserInfo userInfo = this.userInfoDao.getByPhone(phone);
        if (userInfo != null) {
            result.setCode(1);
            result.setMessage("此手机号已经注册");
            return result;
        }
        VerifyCodeRecord record = this.verifyCodeRecordDao
                .getCodeRecordByPhoneAndStatusAndType(phone,
                    VerifyCodeRecord.STATUS_CREATE, VerifyCodeRecord.TYPE_REG);
        Date now = new Date();
        //短信验证码没有过期
        if (record != null && !record.getExpireTime().before(now)) {
            result.setMessage("短信验证码没有过期");
            return result;
        }
        record = new VerifyCodeRecord();
        record.setCreateTime(new Date());
        record.setExpireTime(DateUtils.addMinutes(now, 30));
        record.setPhone(phone);
        record.setVerifyCode(verifyCode);
        record.setStatus(VerifyCodeRecord.STATUS_CREATE);
        record.setType(VerifyCodeRecord.TYPE_REG);
        this.verifyCodeRecordDao.insert(record);
        //直接调用短信验证码接口
        return result;
    }

    /**
     * @param phone
     *        手机号
     * @param verifyCode
     *        短信验证码
     * @param pwd
     *        密码
     * @return
     */
    public boolean userReg(String phone, String verifyCode, String pwd) {
        UserInfo userInfo = this.userInfoDao.getByPhone(phone);
        if (userInfo != null) {
            return false;
        }
        boolean verifyCodeCheckPassed = this.checkRegVerifyCode(phone,
            verifyCode);
        if (!verifyCodeCheckPassed) {
            return false;
        }
        userInfo = new UserInfo();
        userInfo.setPhone(phone);
        userInfo.setStatus(UserInfo.STATUS_CREATE);
        //设置动态密码，明文
        Random r = new Random();
        userInfo.setActivePwd("100000" + r.nextInt(999999) + "");
        userInfo.setPwd(MD5Encoder.encode(verifyCode.getBytes()));
        this.userInfoDao.insert(userInfo);
        return true;
    }

    /**
     * 注册验证码验证
     *
     * @param phone
     * @param verifyCode
     * @return
     */
    public boolean checkRegVerifyCode(String phone, String verifyCode) {
        VerifyCodeRecord record = this.verifyCodeRecordDao
            .getCodeRecordByPhoneAndStatusAndType(phone,
                VerifyCodeRecord.STATUS_CREATE, VerifyCodeRecord.TYPE_REG);
        if (record == null) {
            return false;
        }
        Date now = new Date();
        if (record.getExpireTime().before(now)) {
            return false;
        }
        if (!record.getVerifyCode().equals(verifyCode)) {
            return false;
        }
        this.verifyCodeRecordDao.updateStatus(record.getId(),
            VerifyCodeRecord.STATUS_PASSED);
        return true;
    }

    //完善用户信息
    public void userExtraInfoAdded(UserInfoReq req) {
        UserInfo userInfo = this.userInfoDao.getByPhone(req.getPhone());
        if (userInfo == null) {
            return;
        }
    }

}
