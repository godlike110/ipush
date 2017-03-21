package com.feichuang.ipush.server.common.model.res;

import com.feichuang.ipush.server.common.model.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

/**
 * Created by wenzhiwei on 17-3-16.
 */
@ApiModel("返回对象")
public class SignRes extends BaseObject {

    @ApiModelProperty("签名")
    private String sign;
    @ApiModelProperty("数据map")
    private Map data;

    public Map getData() {
        return data;
    }

    public void setData(Map data) {
        this.data = data;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

}
