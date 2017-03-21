package com.feichuang.ipush.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by wenzhiwei on 17-3-16.
 */
@ApiIgnore
@Controller
@RequestMapping("auth")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "login",method = {RequestMethod.GET,RequestMethod.POST})
    public String login() {
        return "login";
    }

}
