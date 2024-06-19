package com.praktikum.demo.db.mysql.repository;

import com.praktikum.demo.db.mysql.entity.TbMasterAset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbMasterAsetRepository extends JpaRepository<TbMasterAset, Long> {
}
