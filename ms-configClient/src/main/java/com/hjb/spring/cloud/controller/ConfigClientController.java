package com.hjb.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author haojingbin
 * @Description:配置中心客户端controller
 * @Date 2018/5/16
 * @Modified By:
 */
@RestController
public class ConfigClientController {


    @Value("${info.profile}")
    private String profile;


    @RequestMapping(value = "/getProfile",method = RequestMethod.GET)
    public String getProfile(){
        return profile;
    }
}
