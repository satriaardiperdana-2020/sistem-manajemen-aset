package com.praktikum.demo.db.mysql.repository;

import com.praktikum.demo.db.mysql.entity.TbMasterSupplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbMasterSupplierRepository extends JpaRepository<TbMasterSupplier, Long> {
}
