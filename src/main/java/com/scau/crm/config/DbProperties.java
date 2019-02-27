package com.scau.crm.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * DbProperties:数据库信息
 *
 * @author chen
 * @date 2019/02/26
 */
@Configuration
@PropertySource(value = "classpath:db.properties")
@Getter
@Setter
public class DbProperties {

    @Value("${db.driver}")
    private String driver;

    @Value("${db.url}")
    private String url;

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

}
