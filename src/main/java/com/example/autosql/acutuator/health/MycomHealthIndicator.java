package com.example.autosql.acutuator.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kylin
 * @description 电脑健康检查
 * @date 2021-01-31 21:35
 */
@Component
public class MycomHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        Map<String, Object> map = new HashMap<>();
        if (1==1){
            builder.up();
            map.put("count",1);
        }else {
            builder.down();
            map.put("err","连接超时");
        }
        builder.withDetail("detail",map)
        .withDetail("hello","world");
    }
}
