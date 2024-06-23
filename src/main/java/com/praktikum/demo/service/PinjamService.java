package com.praktikum.demo.service;

import com.praktikum.demo.db.mysql.entity.TbTransactionPinjam;

import java.util.List;

public interface PinjamService {
    List<TbTransactionPinjam> getAllDataPinjam();

    TbTransactionPinjam getDataPinjamById(Long id);

    TbTransactionPinjam createPinjam(TbTransactionPinjam tbTransactionPinjam);

    void deletePinjamById(Long id);
}
