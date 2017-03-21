package com.feichuang.ipush.server.common.model.req;

import com.feichuang.ipush.server.common.model.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

/**
 * Created by wenzhiwei on 17-3-16.
 */
@ApiModel("请求对象")
public class SignReq extends BaseObject {

    @ApiModelProperty("密码")
    private String tpasswd;

    @ApiModelProperty("参数map")
    private Map params;

    public String getTpasswd() {
        return tpasswd;
    }

    public void setTpasswd(String tpasswd) {
        this.tpasswd = tpasswd;
    }

    public Map getParams() {
        return params;
    }

    public void setParams(Map params) {
        this.params = params;
    }
}
