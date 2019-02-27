package com.scau.crm.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * RootConfig:根配置，配置数据库
 *
 * @author chen
 * @date 2019/02/26
 */
@Configuration
@MapperScan(basePackages = "com.scau.crm.mapper")
@ComponentScan(basePackages = "com.scau.crm",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = Controller.class)
})
@EnableTransactionManagement
@EnableAspectJAutoProxy
@Import(com.scau.crm.config.DbProperties.class)
public class RootConfig {

    /**
     * 向容器中添加数据源
     *
     * @param dbProperties
     * @return DataSource
     */
    @Bean
    public DataSource dataSource(com.scau.crm.config.DbProperties dbProperties) {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(dbProperties.getUrl());
        dataSource.setDriverClassName(dbProperties.getDriver());
        dataSource.setUsername(dbProperties.getUsername());
        dataSource.setPassword(dbProperties.getPassword());
        dataSource.setMaxActive(20);
        return dataSource;
    }

    /**
     * 往容器中添加事务管理器
     *
     * @param dataSource
     * @return DataSourceTransactionManager
     */
    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }

    /**
     * 配置mybatis,往容器中添加SqlSessionFactory
     *
     * @param dataSource
     * @return SqlSessionFactory
     * @throws Exception
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{pageInterceptor()});
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBean.getObject();
        return sqlSessionFactory;
    }

    /**
     * 往容器中添加mybatis的分页组件
     *
     * @return PageInterceptor
     */
    @Bean
    public PageInterceptor pageInterceptor(){
        PageInterceptor pageInterceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty("value","true");
        pageInterceptor.setProperties(properties);
        return pageInterceptor;
    }
}
