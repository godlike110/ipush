package com.feichuang.ipush.server.controller;

import com.feichuang.ipush.server.common.model.Result;
import com.feichuang.ipush.server.controller.base.RestApi;
import com.feichuang.ipush.server.common.enums.ErrorCode;
import com.feichuang.ipush.server.exceptions.BizException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wenzhiwei on 17-3-14.
 */
@RestController
@RequestMapping("hello")
@Api(value = "测试demo",description = "测试",tags = "测试")
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "index",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "helloword",httpMethod = "GET")
    public String index() {
        return "hello";
    }


    @RequestMapping(value = "getOBj",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "获取对象",httpMethod = "GET")
    public Result<String> getObj() {
        return new RestApi<String>() {
            @Override
            public String process() throws BizException {
                return null;
            }
        }.execute();
    }

    @RequestMapping(value = "getOBjWithException",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "获取对象异常",httpMethod = "GET")
    public Result<String> getObjWithException() {
        return new RestApi<String>() {
            @Override
            public String process() throws BizException {
                throw new BizException(ErrorCode.ERROR);
            }
        }.execute();
    }


}
