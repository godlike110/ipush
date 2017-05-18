package com.feichuang.ipush.server.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.feichuang.ipush.server.common.model.ProjectExperience;
import com.feichuang.ipush.server.common.model.Result;
import com.feichuang.ipush.server.common.model.StudyExperience;
import com.feichuang.ipush.server.common.model.UserInfo;
import com.feichuang.ipush.server.common.model.WorkExperience;
import com.feichuang.ipush.server.common.model.WorkExpirement;
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

    /**
     * 添加工作经历
     *
     * @return
     */
    @RequestMapping(value = "addWorkExperience",
            produces = "application/json; charset=utf-8")
    @ResponseBody
    @ApiOperation(value = "添加工作经历", httpMethod = "POST", notes = "添加工作经历")
    public String addWorkExperience(@RequestBody WorkExperience expireExperience) {
        Result<String> result = new Result<>();
        this.userInfoDao.updateWorkExperience(expireExperience.getUserId(),
            JSON.toJSONString(expireExperience));
        result.setCode(0);
        result.setMessage("添加工作经历成功");
        return JSON.toJSONString(result);
    }

    /**
     * 添加项目经历
     *
     * @return
     */
    @RequestMapping(value = "addProjectExperience",
            produces = "application/json; charset=utf-8")
    @ResponseBody
    @ApiOperation(value = "添加项目经历", httpMethod = "POST", notes = "添加项目经历")
    public String addProjectExperience(
            @RequestBody ProjectExperience projectExperience) {
        Result<String> result = new Result<>();
        this.userInfoDao.updateProjectExperience(projectExperience.getUserId(),
            JSON.toJSONString(projectExperience));
        result.setCode(0);
        result.setMessage("添加项目经历成功");
        return JSON.toJSONString(result);
    }

    /**
     * 添加工作期望
     *
     * @return
     */
    @RequestMapping(value = "updateWorkExpiremence",
            produces = "application/json; charset=utf-8")
    @ResponseBody
    @ApiOperation(value = "添加工作期望", httpMethod = "POST", notes = "添加工作期望")
    public String updateWorkExpiremence(
            @RequestBody WorkExpirement workExpirement) {
        Result<String> result = new Result<>();
        this.userInfoDao.updateWorkExpirement(workExpirement.getUserId(),
            JSON.toJSONString(workExpirement));
        result.setCode(0);
        result.setMessage("添加工作期望成功");
        return JSON.toJSONString(result);
    }

    /**
     * 添加学习经历
     *
     * @return
     */
    @RequestMapping(value = "addStudyExperience",
            produces = "application/json; charset=utf-8")
    @ResponseBody
    @ApiOperation(value = "添加学习经历", httpMethod = "POST", notes = "添加学习经历")
    public String addStudyExperience(
            @RequestBody StudyExperience studyExperience) {
        Result<String> result = new Result<>();
        this.userInfoDao.updateStudyExperience(studyExperience.getUserId(),
            JSON.toJSONString(studyExperience));
        result.setCode(0);
        result.setMessage("添加学习经历成功");
        return JSON.toJSONString(result);
    }

}
