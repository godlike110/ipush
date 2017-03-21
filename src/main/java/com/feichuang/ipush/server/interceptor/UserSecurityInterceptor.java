package com.feichuang.ipush.server.interceptor;

/**
 * Created by wu.kang on 2017/3/16.
 */
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.HandlerInterceptor;

public class UserSecurityInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        /*response.getWriter().print(JSON.toJSONString(new RestApi<String>() {
            @Override
            public String process() throws BizException
            {
                throw new BizException(ErrorCode.NOACCESS);
            }
        }.execute()));*/
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {

    }
}
