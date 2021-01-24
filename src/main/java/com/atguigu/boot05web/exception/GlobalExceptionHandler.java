package com.atguigu.boot05web.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 处理整个web controller的异常
 * @author kylin
 * @date 2021-01-24 15:42
 * @controlleradvice是全局数据处理，异常处理
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({ArithmeticException.class,NullPointerException.class})
    public String handleArithException(Exception e){
        //ExceptionHandler代表异常处理器

        log.error("异常是:{}",e);
        //返回视图地址或者ModelAndView
        return "index";
    }
}
