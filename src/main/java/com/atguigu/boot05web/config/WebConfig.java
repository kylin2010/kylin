package com.atguigu.boot05web.config;

import com.atguigu.boot05web.Bean.Cat;
import com.atguigu.boot05web.Inteceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.util.UrlPathHelper;

import java.util.Calendar;
import java.util.Date;

/**
 * @author wj
 */
@Configuration(proxyBeanMethods = false)
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter(){
        final HiddenHttpMethodFilter methodFilter = new HiddenHttpMethodFilter();
        methodFilter.setMethodParam("_m");
        return methodFilter;
    }



    /**
     *  bean@webmvconfigure===但是为什么返回这个类不清楚
     *  也可以实现webmvcconfigurer
     *  这里分号矩阵
     * @return 返回webmvc
     */

    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return new WebMvcConfigurer() {
            @Override
            public void configurePathMatch(PathMatchConfigurer registry) {
                UrlPathHelper pathHelper = new UrlPathHelper();
                pathHelper.setRemoveSemicolonContent(false);
                registry.setUrlPathHelper(pathHelper);
            }

            @Override
            public void addFormatters(FormatterRegistry registry) {
                registry.addConverter(new Converter<String, Cat>() {

                    @Override
                    public Cat convert(String s) {

                        if(!s.isEmpty()){
                            String[] split = s.split(",");
                            Cat cat = new Cat();
                            cat.setName(split[0]);
                            cat.setAge(Integer.parseInt(split[1]));
                            return cat;
                        }
                        return null;
                    }
                });

                registry.addConverter(new Converter<String, Date>() {

                    @Override
                    public Date convert(String s) {
                        if (!s.isEmpty()) {
                            String[] split = s.split("-");
                            Calendar instance = Calendar.getInstance();
                            instance.clear();
                            instance.set(Calendar.YEAR,Integer.parseInt(split[0]));
                            instance.set(Calendar.MONTH,Integer.parseInt(split[1]));
                            instance.set(Calendar.DAY_OF_MONTH,Integer.parseInt(split[2]));
                            return instance.getTime();
                        }
                        return new Date();
                    }
                });
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoginInterceptor())
                        .addPathPatterns("/**")   //所有请求都会被拦截，包括静态资源
                        .excludePathPatterns("/login","/","/css/**","/images/**","/js/**");//或者yml配置静态资源前缀
            }
        };
    }

    /*@Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        UrlPathHelper pathHelper = new UrlPathHelper();
        pathHelper.setRemoveSemicolonContent(false);
        configurer.setUrlPathHelper(pathHelper);  }*/


}
