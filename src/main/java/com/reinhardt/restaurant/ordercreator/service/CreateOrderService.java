package com.reinhardt.restaurant.ordercreator.service;

import com.reinhardt.restaurant.ordercreator.domain.OrderSpecifications;
import com.reinhardt.utility.config.ZookeeperConfiguration;
import org.apache.zookeeper.KeeperException;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigInteger;
import java.sql.Timestamp;

@Service
public class CreateOrderService {

    private ZookeeperConfiguration zookeeperConfiguration;

    public CreateOrderService(ZookeeperConfiguration zookeeperConfiguration){
        this.zookeeperConfiguration = zookeeperConfiguration;
    }

    public OrderSpecifications createOrder() throws IOException, KeeperException, InterruptedException {
        OrderSpecifications orderSpecifications = new OrderSpecifications();
        orderSpecifications.setOrderDeliveryTime(new Timestamp(System.currentTimeMillis()));
        orderSpecifications.setOrderStatus("PLACED");
        orderSpecifications.setOrderTime(new Timestamp(System.currentTimeMillis()));
        String item = (String) zookeeperConfiguration.getZNodeData("/order/orderid", false);
        int intItem = Integer.valueOf(item);
        orderSpecifications.setOrderId(BigInteger.valueOf(intItem));
        intItem++;
        zookeeperConfiguration.update("/order/orderid", String.valueOf(intItem).getBytes());
        return orderSpecifications;
    }

}
