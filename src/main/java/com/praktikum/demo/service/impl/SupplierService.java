package com.praktikum.demo.service.impl;

import com.praktikum.demo.db.mysql.entity.TbMasterSupplier;

import java.util.List;

public interface SupplierService {
    List<TbMasterSupplier>getAllDataSupplier();
    TbMasterSupplier getAllDataSupplierById(Long id);


}
