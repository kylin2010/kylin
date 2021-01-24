package com.atguigu.boot05web.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author kylin
 * @date 2021-01-21 20:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@ToString
public class User {
    private Integer age;
    private Date birth;
    private Cat cat;

    public User(Integer age) {
        this.age = age;
    }
}
