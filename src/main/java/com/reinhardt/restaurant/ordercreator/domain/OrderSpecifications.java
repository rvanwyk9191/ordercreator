package com.reinhardt.restaurant.ordercreator.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.sql.Timestamp;

@Table(name="orderspecifications")
public class OrderSpecifications {

    @Id
    @Column(name="orderid")
    private BigInteger orderId;
    @Column(name="orderstatus")
    private String orderStatus;
    @Column(name="ordertime")
    private Timestamp orderTime;
    @Column(name="orderdeliverytime")
    private Timestamp orderDeliveryTime;

    public BigInteger getOrderId() {
        return orderId;
    }

    public void setOrderId(BigInteger orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Timestamp getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }

    public Timestamp getOrderDeliveryTime() {
        return orderDeliveryTime;
    }

    public void setOrderDeliveryTime(Timestamp orderDeliveryTime) {
        this.orderDeliveryTime = orderDeliveryTime;
    }
}
