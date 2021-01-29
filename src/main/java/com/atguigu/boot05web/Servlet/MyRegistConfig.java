package com.atguigu.boot05web.Servlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author kylin
 * @description 使用spring底层提供的registbean
 * @date 2021-01-24 21:22
 * 保证是单实例的
 */
@Configuration(proxyBeanMethods = true)
public class MyRegistConfig {

    @Bean
    public ServletRegistrationBean myServlet(){
        MyServlet myServlet = new MyServlet();
        return new ServletRegistrationBean(myServlet,"/my","/yi");
    }

    @Bean
    public FilterRegistrationBean myFilter(){
        MyFilter myFilter = new MyFilter();
        //return new FilterRegistrationBean(myFilter,myservlet());
        FilterRegistrationBean<MyFilter> myFilterFilterRegistrationBean = new FilterRegistrationBean<>(myFilter);
        myFilterFilterRegistrationBean.setUrlPatterns(Arrays.asList("/css/*","/my"));
        return myFilterFilterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean myListener(){
        MyServletConterxtListener myServletConterxtListener = new MyServletConterxtListener();
        return new ServletListenerRegistrationBean(myServletConterxtListener);
    }

    /**
     * druid监控页面
     * @return 通过github中获取到需要注册的servlet名字
     */
//    @Bean
//    public ServletRegistrationBean statViewServlet(){
//        StatViewServlet statViewServlet =new StatViewServlet();
//        ServletRegistrationBean<StatViewServlet> servletRegistrationBean = new ServletRegistrationBean<>(statViewServlet, "/druid/*");
//        servletRegistrationBean.addInitParameter("loginUsername","1001");
//        servletRegistrationBean.addInitParameter("loginPassword","111");
//
//        return servletRegistrationBean;
//    }

//    @Bean
//    public FilterRegistrationBean druidWebStatFilter(){
//
//        WebStatFilter webStatFilter = new WebStatFilter();
//        FilterRegistrationBean<WebStatFilter> webStatFilterFilterRegistrationBean = new FilterRegistrationBean<WebStatFilter>(webStatFilter);
//        webStatFilterFilterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
//        webStatFilterFilterRegistrationBean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
//        return webStatFilterFilterRegistrationBean;
//    }
}
