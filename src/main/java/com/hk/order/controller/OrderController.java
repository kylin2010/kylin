package com.hk.order.controller;

import com.hk.order.bean.Order;
import com.hk.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author kylin
 * @description 处理订单
 * @date 2021-01-30 8:48
 */
@Slf4j
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order")
    public String getOrder(Model model){
        List<Order> list = orderService.list();
        for (Order order : list) {
            System.out.println(order.getOrderCreateUser());
        }
        model.addAttribute("orders",list);
        return "ok";
    }

    @PostMapping("/order")
    public String addOrder(Order order){
        log.info("进入addOrder");
        orderService.save(order);
        return "ok";
    }
}
