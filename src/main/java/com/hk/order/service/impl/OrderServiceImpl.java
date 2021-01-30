package com.hk.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hk.order.bean.Order;
import com.hk.order.mapper.OrderMapper;
import com.hk.order.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @author kylin
 * @description 订单实现类
 * @date 2021-01-30 10:15
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper,Order> implements OrderService {
}
