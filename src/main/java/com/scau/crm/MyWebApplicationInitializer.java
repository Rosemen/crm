package com.scau.crm;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * MyWebApplicationInitializer:往容器中添加servlet/filter组件
 *
 * @author chen
 * @date 2019/02/26
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {

    /**
     * 往容器中添加CharacterEncodingFilter：处理Post请求参数乱码问题
     *
     * @param servletContext
     * @throws ServletException
     */
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        FilterRegistration.Dynamic encodingFilter = servletContext.addFilter("encodingFilter", CharacterEncodingFilter.class);
        encodingFilter.addMappingForUrlPatterns(null, false, "/");
    }
}
