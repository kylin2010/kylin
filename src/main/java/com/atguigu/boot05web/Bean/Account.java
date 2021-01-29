package com.atguigu.boot05web.Bean;

import lombok.Data;

/**
 * @author kylin
 * @description mybatis中封装属性
 * @date 2021-01-28 22:43
 */
@Data
public class Account {

    private Long id;
    private String userId;  //mybatis默认没有开启驼峰策略
    private Integer money;
}
