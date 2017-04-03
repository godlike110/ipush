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
import com.feichuang.ipush.server.common.model.req.UserInfoReq;
import com.feichuang.ipush.server.common.model.req.UserRegReq;
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

    /**
     * 获取注册验证码
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "getRegVerifyCode", method = RequestMethod.GET)
    @ResponseBody
    public String getRegVerifyCode(@RequestBody VerifyCodeRecordReq req) {
        Random r = new Random();
        int code = r.nextInt(999999);
        Result<String> result = this.userInfoService.sendRegMsg(req.getPhone(),
            code + "");
        return JSON.toJSONString(result);
    }

    //用户注册接口
    @RequestMapping(value = "userReg", method = RequestMethod.GET)
    @ResponseBody
    public String userReg(@RequestBody UserRegReq req) {
        boolean resultOk = this.userInfoService.userReg(req.getPhone(),
            req.getVerifyCode(), req.getPwd());
        Result<String> result = new Result<>();
        if (!resultOk) {
            result.setCode(1);
        }
        return JSON.toJSONString(result);
    }

    //注册后完善信息
    @RequestMapping(value = "userRegExtraInfo", method = RequestMethod.GET)
    @ResponseBody
    public String regExtraInfo(@RequestBody UserInfoReq req) {
        this.userInfoService.userExtraInfoAdded(req);
        return JSON.toJSONString(null);
    }

}
