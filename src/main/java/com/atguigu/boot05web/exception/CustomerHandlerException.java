package com.atguigu.boot05web.exception;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author kylin
 * @description 自定义的异常解析器
 * @date 2021-01-24 19:52
 * 设置优先级，不然不能被，数字越小，优先级越高
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
@Component
public class CustomerHandlerException implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse,
                                         Object o, Exception e) {
        try {
            httpServletResponse.sendError(511,"我喜欢的错误");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return new ModelAndView();
    }
}
