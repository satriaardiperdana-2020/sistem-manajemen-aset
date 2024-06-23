package com.praktikum.demo.service;

import com.praktikum.demo.db.mysql.entity.TbTransactionOrder;

import java.util.List;

public interface OrderService {
    List<TbTransactionOrder> getAllDataOrder();
    TbTransactionOrder createOrder(TbTransactionOrder tbTransactionOrder);
    TbTransactionOrder getDataOrderById(Long id);
    void deleteOrderById(Long id);

}
