package com.atguigu.boot05web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * ServletComponentScan指定原生Servlert放在哪里
 * @author wj
 */
//@ServletComponentScan(basePackages="com.atguigu.boot05web")
    @MapperScan(basePackages = "com.atguigu.boot05web.mapper")
@SpringBootApplication
public class Boot05WebApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Boot05WebApplication.class, args);
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
//            System.out.println(name);
        }
    }

}
