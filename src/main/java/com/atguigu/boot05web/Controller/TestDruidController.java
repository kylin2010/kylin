package com.atguigu.boot05web.Controller;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author kylin
 * @description 测试阿里巴巴druid数据源监控
 * @date 2021-01-28 13:33
 */
@Controller
public class TestDruidController {


    private final JdbcTemplate jdbcTemplate;

    public TestDruidController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @ResponseBody
    @GetMapping("/sql")
    public String queryFromDb(){
        System.out.println("\"你好\" = " + "你好");
        Long aLong = jdbcTemplate.queryForObject("select count(*) from user", Long.class);
        System.out.println(aLong);

        if (aLong != null) {
            return aLong.toString();
        }

        return "";

    }



}
