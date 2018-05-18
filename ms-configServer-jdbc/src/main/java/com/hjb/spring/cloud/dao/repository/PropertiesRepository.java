package com.hjb.spring.cloud.dao.repository;

import com.hjb.spring.cloud.dao.entity.Properties;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author haojingbin
 * @Description:
 * @Date 2018/5/17
 * @Modified By:
 */
public interface PropertiesRepository extends JpaRepository<Properties,Long> {

}
