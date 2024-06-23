package com.praktikum.demo.db.mysql.repository;

import com.praktikum.demo.db.mysql.entity.TbTransactionOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbTransactionOrderRepository extends JpaRepository<TbTransactionOrder, Long> {
}
