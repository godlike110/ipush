package com.feichuang.ipush.server.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.feichuang.ipush.server.common.model.CompanyPosition;
import com.feichuang.ipush.server.common.model.Result;
import com.feichuang.ipush.server.dao.CompanyPositionDao;
import com.feichuang.ipush.server.dao.ItCompanyInfoDao;

/**
 * 测试
 *
 * @author junze
 */
@Controller
@RequestMapping("company")
@Api(value = "公司职位操作", description = "对外服务", tags = "公司职位操作")
public class CompanyController {

    @Autowired
    private ItCompanyInfoDao itCompanyInfoDao;

    @Autowired
    private CompanyPositionDao companyPositionDao;

    @RequestMapping(value = "test",
            produces = "application/json; charset=utf-8")
    @ResponseBody
    public String index(HttpServletRequest request) {
        String companyName = request.getParameter("companyName");
        return JSON.toJSONString(this.itCompanyInfoDao
            .getCompanyByName(companyName));
    }

    /**
     * 职位发布
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "publishPosition",
            produces = "application/json; charset=utf-8")
    @ResponseBody
    @ApiOperation(value = "职位发布", httpMethod = "POST", notes = "职位发布")
    public String publishPosition(@RequestBody CompanyPosition postion,
            HttpServletRequest request) {
        Result<String> result = new Result<>();
        postion.setStatus(1);
        this.companyPositionDao.save(postion);
        result.setCode(0);
        result.setMessage("发布职位成功");
        return JSON.toJSONString(result);
    }

}
