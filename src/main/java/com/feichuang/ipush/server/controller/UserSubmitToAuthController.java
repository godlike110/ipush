package com.feichuang.ipush.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户提交实名，公司认证 请求
 *
 * @author junze
 */
@Controller
@RequestMapping("userSubmitAuth")
public class UserSubmitToAuthController {

    public void userSubmitToAuth(String userId, String realName, String email,
            String AuthImgPath) {

    }

}
