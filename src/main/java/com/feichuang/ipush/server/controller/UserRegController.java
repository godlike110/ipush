package com.feichuang.ipush.server.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.feichuang.ipush.server.common.model.Result;
import com.feichuang.ipush.server.common.model.req.VerifyCodeRecordReq;
import com.feichuang.ipush.server.service.impl.UserInfoService;

/**
 * 用户注册相关接口
 *
 * @author junze
 */
@Controller
@RequestMapping("")
public class UserRegController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "getRegVerifyCode", method = RequestMethod.GET)
    @ResponseBody
    public String getRegVerifyCode(@RequestBody VerifyCodeRecordReq req) {
        Random r = new Random();
        int code = r.nextInt(999999);
        Result<String> result = this.userInfoService.sendRegMsg(req.getPhone(),
            code + "");
        return JSON.toJSONString(result);
    }

}
