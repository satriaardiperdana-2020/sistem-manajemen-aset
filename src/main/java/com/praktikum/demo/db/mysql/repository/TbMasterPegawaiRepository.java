package com.praktikum.demo.db.mysql.repository;

import com.praktikum.demo.db.mysql.entity.TbMasterPegawai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbMasterPegawaiRepository extends JpaRepository <TbMasterPegawai, Long>{
}
