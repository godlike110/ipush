package com.feichuang.ipush.server.service.impl;

import java.util.Date;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feichuang.ipush.server.common.model.UserInfo;
import com.feichuang.ipush.server.common.model.VerifyCodeRecord;
import com.feichuang.ipush.server.dao.UserInfoDao;
import com.feichuang.ipush.server.dao.VerifyCodeRecordDao;

@Service
public class UserInfoService {

    @Autowired
    private VerifyCodeRecordDao verifyCodeRecordDao;

    @Autowired
    private UserInfoDao userInfoDao;

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
        return true;
    }

}
