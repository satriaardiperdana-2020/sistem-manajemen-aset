package com.praktikum.demo.service.impl;

import com.praktikum.demo.db.mysql.entity.TbTransactionOrder;
import com.praktikum.demo.db.mysql.repository.TbTransactionOrderRepository;
import com.praktikum.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    TbTransactionOrderRepository tbTransactionOrderRepository;
    public List<TbTransactionOrder> getAllDataOrder(){
        return tbTransactionOrderRepository.findAll();
    }
    public TbTransactionOrder createOrder(TbTransactionOrder tbTransactionOrder){
        return tbTransactionOrderRepository.save(tbTransactionOrder);
    }
    public TbTransactionOrder getDataOrderById(Long id){
        return tbTransactionOrderRepository.findById(id).orElse(null);
    }
    public void deleteOrderById(Long id){
        tbTransactionOrderRepository.deleteById(id);
    }
}
