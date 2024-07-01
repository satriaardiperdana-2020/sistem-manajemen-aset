package com.praktikum.demo.db.mysql.repository;

import com.praktikum.demo.db.mysql.entity.TbMasterAset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbMasterAsetRepository extends JpaRepository<TbMasterAset, Long> {
    //HINDARI SELECT * KARENA KALAU ADA PENAMBAHAN FIELD BARU TANPA DIKETAHUI AKAN ERROR (ENTITY HARUS DI UPDATE)
    @Query(value = "SELECT tbma_id, tbma_created_date, tbma_nama, tbma_status, tbma_qty, tbma_tbms_id FROM tb_master_aset", nativeQuery = true)
    List<TbMasterAset> getAsetQuery();
}
