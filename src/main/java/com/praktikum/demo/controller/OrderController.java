package com.praktikum.demo.controller;

import com.praktikum.demo.db.mysql.entity.TbTransactionOrder;
import com.praktikum.demo.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping(value ="/order", produces = "application/json")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/get-order")
    public List<TbTransactionOrder> reqOrder(){
        return orderService.getAllDataOrder();
    }

    @GetMapping("/get-order/{id}")
    public TbTransactionOrder reqOrderById(@PathVariable Long id){
        return orderService.getDataOrderById(id);
    }

    @PostMapping("/save-order")
    public TbTransactionOrder createOrder(@RequestBody TbTransactionOrder tbTransactionOrder) {
        return orderService.createOrder(tbTransactionOrder);
    }

    @DeleteMapping("/delete-order/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderService.deleteOrderById(id);

    }
}
