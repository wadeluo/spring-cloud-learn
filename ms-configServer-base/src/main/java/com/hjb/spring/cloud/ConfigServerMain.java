package com.hjb.spring.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author haojingbin
 * @Description:启动入口类
 * @Date 2018/5/15
 * @Modified By:
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerMain {

    public static void main(String[] args){
        SpringApplication.run(ConfigServerMain.class,args);
    }
}
