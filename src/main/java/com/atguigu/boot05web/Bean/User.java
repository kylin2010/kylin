package com.atguigu.boot05web.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
public class User {
    private Integer age;
    private Date birth;

}
