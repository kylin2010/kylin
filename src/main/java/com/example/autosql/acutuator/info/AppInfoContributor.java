package com.example.autosql.acutuator.info;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

/**
 * @author kylin
 * @description 实现一个conntributor
 * @date 2021-01-31 22:05
 */
@Component
public class AppInfoContributor implements InfoContributor {


    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("ni","anNi");
    }
}
