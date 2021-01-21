package com.atguigu.boot05web.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author kylin
 * @date 2021-01-21 20:28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@ToString
public class Cat {
    private String name;
    private Integer age;
}
