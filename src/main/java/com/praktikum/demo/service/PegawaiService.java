package com.praktikum.demo.service;

import com.praktikum.demo.db.mysql.entity.TbMasterPegawai;

import java.util.List;

public interface PegawaiService {
    List<TbMasterPegawai> getAllDataPegawai();
    TbMasterPegawai createPegawai(TbMasterPegawai tbMasterPegawai);
    TbMasterPegawai getDataPegawaiById(Long id);
    void deletePegawaiById(Long id);
    //
}
