package com.atguigu.boot05web;

import com.atguigu.boot05web.Bean.User22;
import com.atguigu.boot05web.mapper.User22Mapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Slf4j
@SpringBootTest
class Boot05WebApplicationTests {

    /**
     * 直接用的是jdbc原生的模板
     */
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Autowired
    DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Test
    void contextLoads() {
//        jdbcTemplate.queryForObject("");
//        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from user");
        Long aLong = jdbcTemplate.queryForObject("select count(*) from user", Long.class);
        System.out.println(aLong);
    }

    @Test
    void test1(){
        log.info("数据源类型:{}",dataSource.getClass());
    }

    @Autowired
    User22Mapper user22Mapper;
    @Test
    void test2(){
        User22 user22 = user22Mapper.selectById(1L);
        log.info("用户信息:{}",user22);
    }

}
