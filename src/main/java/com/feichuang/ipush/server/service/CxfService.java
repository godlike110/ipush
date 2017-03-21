package com.feichuang.ipush.server.service;

import com.feichuang.ipush.server.common.model.req.SignReq;
import com.feichuang.ipush.server.common.model.res.SignRes;
import com.feichuang.ipush.server.exceptions.BizException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by wenzhiwei on 17-3-21.
 */
@WebService
public interface CxfService {

    @WebMethod(operationName = "getRes")
    SignRes getSign(@WebParam(name="signReq") SignReq req) throws BizException;

    @WebMethod(operationName = "getInfo")
    SignRes getInfo(@WebParam(name="id") int id) throws BizException;

}
