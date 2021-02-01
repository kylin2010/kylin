package com.example.profile.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author kylin
 * @description
 * @date 2021-02-01 19:40
 */
@Data
@Profile("test")
@ConfigurationProperties("person")
@Component
public class Boss implements People{
    private String name;
    private Integer age;
}
