package com.atguigu.boot05web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author kylin
 * @description 全面接管1静态资源2视图解析器3欢迎页全部失效
 * @date 2021-01-27 22:27
 */
//@EnableWebMvc
    @Configuration
public class AdminWebConfig implements WebMvcConfigurer {

    /**
     * 访问/aa/**都去static下面匹配
     * @param registry
     */
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/aa/**")
//                .addResourceLocations("classpath:/static/")
//    }
}
