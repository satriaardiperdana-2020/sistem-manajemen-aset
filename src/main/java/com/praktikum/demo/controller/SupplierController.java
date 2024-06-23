package com.praktikum.demo.controller;

import com.praktikum.demo.db.mysql.entity.TbMasterSupplier;
import com.praktikum.demo.service.SupplierService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
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
        return supplierService.getDataSupplierById(id);
    }

    @PostMapping("/save-supplier")
    public TbMasterSupplier createSupplier(@RequestBody TbMasterSupplier tbMasterSupplier) {
        return supplierService.createSupplier(tbMasterSupplier);
    }

    @DeleteMapping("/delete-supplier/{id}")
    public void deleteSupplier(@PathVariable Long id) {
        supplierService.deleteSupplierById(id);
    }
}
