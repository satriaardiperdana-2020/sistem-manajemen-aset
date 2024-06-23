package com.praktikum.demo.service;

import com.praktikum.demo.db.mysql.entity.TbMasterSupplier;

import java.util.List;

public interface SupplierService {
    List<TbMasterSupplier>getAllDataSupplier();
    TbMasterSupplier getDataSupplierById(Long id);
    TbMasterSupplier createSupplier(TbMasterSupplier tbMasterSupplier);
    void deleteSupplierById(Long id);


}
