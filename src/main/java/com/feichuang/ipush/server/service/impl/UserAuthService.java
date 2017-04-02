package com.feichuang.ipush.server.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feichuang.ipush.server.common.model.ItCompanyInfo;
import com.feichuang.ipush.server.common.model.UserAuth;
import com.feichuang.ipush.server.dao.ItCompanyInfoDao;
import com.feichuang.ipush.server.dao.UserAuthDao;
import com.feichuang.ipush.server.dao.UserInfoDao;

/**
 * 用户审核
 *
 * @author junze
 */
@Service
public class UserAuthService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Autowired
    private UserAuthDao userAuthDao;

    @Autowired
    private ItCompanyInfoDao itCompanyInfoDao;

    /**
     * 用户提交 认证(验证是否是某个公司的)
     * 用户可以重复提交认证,
     *
     * @param userId
     * @param realName
     * @param companyId
     * @param companyName
     * @param email
     * @param authImgPath
     */
    public Map<Boolean, String> userSubmitToAuth(int userId, String realName,
            int companyId, String companyName, String email, String authImgPath) {
        Map<Boolean, String> result = new HashMap<>();

        Date now = new Date();
        Date createYeasterDayTime = DateUtils.addDays(now, -1);
        int exists = this.userAuthDao.getTimesByCreateTime(userId,
            createYeasterDayTime);
        if (exists > 0) {
            result.put(false, "提交频率太高");
            return result;
        }

        UserAuth auth = this.userAuthDao.getLatestAuth(userId);
        if (auth != null && auth.getStatus() == UserAuth.STATUS_PROCESSING) {
            result.put(false, "您有处理中的审核,请勿重复提交");
            return result;
        }

        ItCompanyInfo company = this.itCompanyInfoDao
            .getCompanyByName(companyName);
        if (company == null) {
            result.put(false, "公司不存在，请确认后再提交");
            return result;
        }

        auth = new UserAuth();
        auth.setUserId(userId);
        auth.setUserName(realName);
        auth.setAuthPhoto(authImgPath);
        auth.setCreateTime(now);
        auth.setCompanyId(companyId);
        auth.setCompanyName(companyName);
        auth.setEmail(email);
        this.userAuthDao.insert(auth);

        result.put(true, "");
        return result;
    }

}
