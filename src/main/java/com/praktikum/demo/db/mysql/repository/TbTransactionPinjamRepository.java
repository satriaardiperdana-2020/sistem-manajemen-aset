package com.praktikum.demo.db.mysql.repository;

import com.praktikum.demo.db.mysql.entity.TbTransactionPinjam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbTransactionPinjamRepository extends JpaRepository<TbTransactionPinjam, Long> {
}
