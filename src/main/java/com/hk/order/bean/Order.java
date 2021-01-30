package com.hk.order.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author kylin
 * @description 订单记录
 * @date 2021-01-30 10:07
 */
@Component
@Data
@TableName("order1")
public class Order {

    @TableId(value = "order_id",type = IdType.AUTO)
    private Integer orderId;
    private String materialName;
    private String materialNumber;
    private String item;
    private String purchaseTime;
    private String orderCreateUser;
    private Date createTime;
    private String purchaseUser;
    private String mark;
    private Integer step;
    private Integer visible;

}
