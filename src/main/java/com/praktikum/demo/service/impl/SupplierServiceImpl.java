package com.praktikum.demo.service.impl;

import com.praktikum.demo.db.mysql.entity.TbMasterSupplier;
import com.praktikum.demo.db.mysql.repository.TbMasterSupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    TbMasterSupplierRepository tbMasterSupplierRepository;

    @Override
    public List<TbMasterSupplier> getAllDataSupplier() {
        return tbMasterSupplierRepository.findAll();
    }

    @Override
    public TbMasterSupplier getAllDataSupplierById(Long id) {
        return tbMasterSupplierRepository.findById(id).orElse(null);
    }

}
