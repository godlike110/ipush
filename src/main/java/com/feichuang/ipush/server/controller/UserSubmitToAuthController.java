package com.feichuang.ipush.server.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.feichuang.ipush.server.common.model.req.UserAuthReq;
import com.feichuang.ipush.server.service.impl.UserAuthService;

/**
 * 用户提交实名，公司认证 请求
 *
 * @author junze
 */
@Controller
@RequestMapping("")
public class UserSubmitToAuthController {

    @Autowired
    private UserAuthService userAuthService;

    @RequestMapping(value = "userSubmitAuth", method = RequestMethod.GET)
    @ResponseBody
    public String index(@RequestBody UserAuthReq req) {
        int userId = req.getUserId();
        String realName = req.getUserName();
        int companyId = req.getCompanyId();
        String companyName = req.getCompanyName();
        String email = req.getEmail();
        String authImgPath = req.getAuthPhoto();
        Map<String, Object> result = this.userAuthService.userSubmitToAuth(
            userId, realName, companyId, companyName, email, authImgPath);
        return JSON.toJSONString(result);
    }
}
