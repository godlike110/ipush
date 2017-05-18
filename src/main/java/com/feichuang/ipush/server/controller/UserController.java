package com.feichuang.ipush.server.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.feichuang.ipush.server.common.model.Result;
import com.feichuang.ipush.server.common.model.UserInfo;
import com.feichuang.ipush.server.dao.UserInfoDao;

@RestController
@RequestMapping("user")
@Api(value = "用户操作", description = "对外服务", tags = "用户操作")
public class UserController {

    @Autowired
    private UserInfoDao userInfoDao;

    /**
     * 完善个人基本信息
     *
     * @return
     */
    @RequestMapping(value = "publishPosition",
            produces = "application/json; charset=utf-8")
    @ResponseBody
    @ApiOperation(value = "完善个人基本信息", httpMethod = "POST", notes = "完善个人基本信息")
    public String completeBasicInfo(@RequestBody UserInfo userInfo) {
        Result<String> result = new Result<>();
        this.userInfoDao.initBasicInfo(userInfo);
        result.setCode(0);
        result.setMessage("个人信息保存成功");
        return JSON.toJSONString(result);
    }

}
