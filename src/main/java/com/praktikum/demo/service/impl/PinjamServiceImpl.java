package com.praktikum.demo.service.impl;

import com.praktikum.demo.db.mysql.entity.TbTransactionPinjam;
import com.praktikum.demo.db.mysql.repository.TbTransactionPinjamRepository;
import com.praktikum.demo.service.PinjamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PinjamServiceImpl implements PinjamService {

    @Autowired
    TbTransactionPinjamRepository tbTransactionPinjamRepository;

    public List<TbTransactionPinjam> getAllDataPinjam(){

        return tbTransactionPinjamRepository.findAll();
    }
    public TbTransactionPinjam createPinjam(TbTransactionPinjam tbTransactionPinjam){
        return tbTransactionPinjamRepository.save(tbTransactionPinjam);
    }
    public TbTransactionPinjam getDataPinjamById(Long id){
        return tbTransactionPinjamRepository.findById(id).orElse(null);
    }
    public void deletePinjamById(Long id){
        tbTransactionPinjamRepository.deleteById(id);
    }
}
