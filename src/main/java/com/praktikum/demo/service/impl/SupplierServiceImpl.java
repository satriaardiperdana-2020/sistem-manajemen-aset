package com.praktikum.demo.service.impl;

import com.praktikum.demo.db.mysql.entity.TbMasterSupplier;
import com.praktikum.demo.db.mysql.repository.TbMasterSupplierRepository;
import com.praktikum.demo.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    TbMasterSupplierRepository tbMasterSupplierRepository;


    public List<TbMasterSupplier> getAllDataSupplier() {
        return tbMasterSupplierRepository.findAll();
    }
    public TbMasterSupplier createSupplier(TbMasterSupplier tbMasterSupplier){
        return tbMasterSupplierRepository.save(tbMasterSupplier);
    }
    public TbMasterSupplier getDataSupplierById(Long id) {
        return tbMasterSupplierRepository.findById(id).orElse(null);
    }
    public void deleteSupplierById(Long id){
        tbMasterSupplierRepository.deleteById(id);
    }
}
