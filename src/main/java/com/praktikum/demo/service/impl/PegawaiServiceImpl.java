package com.praktikum.demo.service.impl;

import com.praktikum.demo.db.mysql.entity.TbMasterPegawai;
import com.praktikum.demo.db.mysql.repository.TbMasterPegawaiRepository;
import com.praktikum.demo.service.PegawaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PegawaiServiceImpl implements PegawaiService {
    @Autowired
    TbMasterPegawaiRepository tbMasterPegawaiRepository;

    public List<TbMasterPegawai> getAllDataPegawai(){
        return tbMasterPegawaiRepository.findAll();
    }

    public TbMasterPegawai createPegawai(TbMasterPegawai tbMasterPegawai){
        return tbMasterPegawaiRepository.save(tbMasterPegawai);
    }
    public TbMasterPegawai getDataPegawaiById(Long id){
        return tbMasterPegawaiRepository.findById(id).orElse(null);

    }
    public void deletePegawaiById(Long id){
        tbMasterPegawaiRepository.deleteById(id);
    }
}
