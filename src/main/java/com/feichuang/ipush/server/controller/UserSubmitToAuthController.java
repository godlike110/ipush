package com.feichuang.ipush.server.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
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
    public String index(HttpServletRequest req) {
        int userId = Integer.parseInt(req.getParameter("userId"));
        String realName = req.getParameter("realName");
        int companyId = Integer.parseInt(req.getParameter("companyId"));
        String companyName = req.getParameter("companyName");
        String email = req.getParameter("email");
        String authImgPath = req.getParameter("authImgPath");
        Map<String, Object> result = this.userAuthService.userSubmitToAuth(
            userId, realName, companyId, companyName, email, authImgPath);
        return JSON.toJSONString(result);
    }
}
