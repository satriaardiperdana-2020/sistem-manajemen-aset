package com.praktikum.demo.service.impl;

import com.praktikum.demo.db.mysql.entity.TbMasterAset;

import java.util.List;

public interface AsetService {
    List<TbMasterAset> getAllDataAset();
    TbMasterAset createAset(TbMasterAset tbMasterAset);
    TbMasterAset getDataAsetById(Long id);
    void deleteAsetById(Long id);
}
