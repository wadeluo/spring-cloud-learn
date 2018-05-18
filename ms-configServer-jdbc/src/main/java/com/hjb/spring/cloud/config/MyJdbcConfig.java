package com.hjb.spring.cloud.config;

import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.config.server.environment.EnvironmentRepository;

/**
 * @Author haojingbin
 * @Description:
 * @Date 2018/5/17
 * @Modified By:
 */
public class MyJdbcConfig implements EnvironmentRepository {


    @Override
    public Environment findOne(String s, String s1, String s2) {
        return null;
    }
}
