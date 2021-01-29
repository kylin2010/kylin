package com.atguigu.boot05web.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author kylin
 * @description 自己配置的数据源
 * @date 2021-01-27 19:11
 */
//@Configuration
    @Deprecated
public class MyDataSourceConfiguration {

    @ConfigurationProperties("spring.datasource")
    @Bean
    public DataSource dataSource() throws SQLException {
        //@默认的容器中没有才会配@ConditionalOnMissingBean({DataSource.class})
        DruidDataSource druidDataSource = new DruidDataSource();
//        druidDataSource.setUrl();
//        druidDataSource.setPassword();
        //加入监控功能，可以在application.yaml中配置
        /*
        *druidDataSource.setFilters("stat,wall");
         */

        return druidDataSource;
    }
}
