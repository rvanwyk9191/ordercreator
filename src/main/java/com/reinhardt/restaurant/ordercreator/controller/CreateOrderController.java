package com.reinhardt.restaurant.ordercreator.controller;

import com.reinhardt.restaurant.ordercreator.domain.OrderSpecifications;
import com.reinhardt.restaurant.ordercreator.service.CreateOrderService;
import org.apache.zookeeper.KeeperException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController()
@RequestMapping("/orders")
public class CreateOrderController {

    private final CreateOrderService createOrderService;

    public CreateOrderController(CreateOrderService createOrderService) {
        this.createOrderService = createOrderService;
    }

    @PostMapping("/create")
    public OrderSpecifications createOrder() throws IOException, KeeperException, InterruptedException {
        return createOrderService.createOrder();
    }

}
