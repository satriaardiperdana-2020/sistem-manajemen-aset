package com.praktikum.demo.controller;

import com.praktikum.demo.db.mysql.entity.TbMasterSupplier;
import com.praktikum.demo.service.impl.SupplierService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/supplier", produces = "application/json")
@RequiredArgsConstructor
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping("/get-supplier")
    public List<TbMasterSupplier> reqSupplier(){
        return supplierService.getAllDataSupplier();
    }

    @GetMapping("/get-supplier/{id}")
    public TbMasterSupplier reqSupplierById(@PathVariable Long id){
        return supplierService.getAllDataSupplierById(id);
    }
}
