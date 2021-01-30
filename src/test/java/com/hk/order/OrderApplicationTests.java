package com.hk.order;

import com.hk.order.mapper.OrderMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class OrderApplicationTests {

    @Autowired
    OrderMapper orderMapper;

    @Test
    void contextLoads() {
//        Order order = orderMapper.selectById(1);

    }

}
