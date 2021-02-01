package com.example.profile.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author kylin
 * @description
 * @date 2021-02-01 19:43
 */
@Profile("prod")
@Component
@ConfigurationProperties("people")
@Data
public class Worker implements People{
    private String name;
    private Integer age;
}
