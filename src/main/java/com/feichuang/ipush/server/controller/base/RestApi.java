package com.feichuang.ipush.server.controller.base;

import com.alibaba.fastjson.JSON;
import com.feichuang.ipush.server.common.model.Result;
import com.feichuang.ipush.server.common.util.ResultUtils;
import com.feichuang.ipush.server.exceptions.BizException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wenzhiwei on 17-3-15.
 */
public abstract class RestApi<T> extends Api<T>{

    private static final Logger logger = LoggerFactory.getLogger(RestApi.class);

    public abstract T process() throws BizException;

    public Result<T> execute() {

        try {

            T result = process();

            logger.info("result:{}",JSON.toJSONString(result));
            //业务成功
            return ResultUtils.ok(result);

        } catch (BizException e) {
            //业务异常
            return ResultUtils.failWithMsg(e.getCode());

        } catch (Exception e) {
            //其他异常
            return ResultUtils.fail();
        }
    }

}
