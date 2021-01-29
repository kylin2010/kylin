package com.atguigu.boot05web.Servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author kylin
 * @description listener有很多
 * @date 2021-01-24 21:13
 */

//@WebListener
@Slf4j
public class MyServletConterxtListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("监听到项目的初始化完成");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("监听到项目的销毁");
    }
}
