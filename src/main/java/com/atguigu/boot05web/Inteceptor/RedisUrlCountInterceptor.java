package com.atguigu.boot05web.Inteceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author kylin
 * @description 统计请求数量
 * @date 2021-01-31 9:55
 */

/**
 * 只有容中的组件才能解析redistemplate。所以添加拦截器时需要从容器中取出来，不能new
 */
@Component
public class RedisUrlCountInterceptor implements HandlerInterceptor {

    @Autowired
    StringRedisTemplate redisTemplate;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
//        ValueOperations<String, String> operations = redisTemplate.opsForValue();
//        operations.set(requestURI,);
        //默认每次访问每次加1
        redisTemplate.opsForValue().increment(requestURI);
        return true;
    }
}
