package com.atguigu.boot05web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 处理用户太多异常
 *
 * @author kylin
 * @date 2021-01-24 16:07
 *
 */
@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "用户数量太多")
public class UserToManyException extends RuntimeException{

    public UserToManyException(String message) {
        super(message);
    }

    public UserToManyException() {
    }
}
