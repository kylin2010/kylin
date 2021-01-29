package com.atguigu.boot05web.Bean;

import lombok.Data;

import java.util.Date;

/**
 * @author kylin
 * @description 测试注释形式的mybatis
 * @date 2021-01-29 9:13
 */
@Data
public class Alarm {

    private Long alarmId;
    private String alermNo;
    private Date date;
    private String content;

}
