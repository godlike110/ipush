package com.feichuang.ipush.server.service.impl;

import com.feichuang.ipush.server.common.enums.ErrorCode;
import com.feichuang.ipush.server.service.CxfService;
import com.feichuang.ipush.server.common.model.req.SignReq;
import com.feichuang.ipush.server.common.model.res.SignRes;
import com.feichuang.ipush.server.exceptions.BizException;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wenzhiwei on 17-3-21.
 */
@WebService
//@WebService(targetNamespace = "http://service.server.henghuirong.hc.com/", endpointInterface = "CxfService")
public class CxfServiceImpl implements CxfService {

    @Override
    public SignRes getSign(SignReq req) throws BizException {

        if(req == null) {
            throw new BizException(ErrorCode.PARAMERROR);
        }

        SignRes signRes;
        signRes = new SignRes();
        signRes.setSign("hello");
        Map map = new HashMap<>();
        map.put("name","caifu");
        map.put("value","hello");
        signRes.setData(map);
        return signRes;
    }

    @Override
    public SignRes getInfo(int id) throws BizException {
        SignRes signRes = new SignRes();
        signRes.setSign(String.valueOf(id));
        Map map = new HashMap<>();
        map.put("name","caifu");
        map.put("value","fsdafas");
        signRes.setData(map);
        return signRes;
    }
}
