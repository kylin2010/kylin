package com.atguigu.boot05web.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author shkstart
 * @date 2021-01-19 22:48
 */
@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Person {
    private String name;
    private Car car;
}
