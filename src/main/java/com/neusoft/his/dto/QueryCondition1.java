package com.neusoft.his.dto;

import java.io.Serializable;

public class QueryCondition1 implements Serializable {

    private int orderId;
    private int userId;

    public int getOrderId() {
        return orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "QueryCondition1{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                '}';
    }
}
