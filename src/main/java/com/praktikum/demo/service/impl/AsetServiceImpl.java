package com.praktikum.demo.service.impl;

import com.praktikum.demo.db.mysql.entity.TbMasterAset;
import com.praktikum.demo.db.mysql.repository.TbMasterAsetRepository;
import com.praktikum.demo.service.AsetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AsetServiceImpl implements AsetService {
    @Autowired
    TbMasterAsetRepository tbMasterAsetRepository;

    public List<TbMasterAset> getAllDataAset(){
        return tbMasterAsetRepository.findAll();
    }
    public TbMasterAset createAset(TbMasterAset tbMasterAset){
        return tbMasterAsetRepository.save(tbMasterAset);
    }
    public TbMasterAset getDataAsetById(Long id){
        return tbMasterAsetRepository.findById(id).orElse(null);
    }
    public void deleteAsetById(Long id){
        tbMasterAsetRepository.deleteById(id);
    }
}
