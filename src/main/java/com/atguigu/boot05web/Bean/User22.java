package com.atguigu.boot05web.Bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author kylin
 * @description 测试mybatisplus
 * @date 2021-01-29 21:33
 */
@Data
@TableName("user22")       //默认数据库类名匹配，可以特别之处
public class User22 {
    private Long id;
    private String name;
    private Integer age;
    private String email;


    @TableField(exist = false)
    private String content;     //所有的属性都必须要在表中存在，如果不存在那么需要标注
}