package com.hjb.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author haojingbin
 * @Description:
 * @Date 2018/5/17
 * @Modified By:
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerMain {

    public static void main(String[] args){
        SpringApplication.run(DiscoveryServerMain.class,args);
    }
}
