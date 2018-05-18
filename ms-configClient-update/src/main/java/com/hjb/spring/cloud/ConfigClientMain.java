package com.hjb.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author haojingbin
 * @Description:启动入口类
 * @Date 2018/5/16
 * @Modified By:
 */

@SpringBootApplication
public class ConfigClientMain {

    public static void main(String[] args){
        SpringApplication.run(ConfigClientMain.class,args);
    }
}
