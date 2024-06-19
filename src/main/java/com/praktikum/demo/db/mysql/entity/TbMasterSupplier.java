package com.praktikum.demo.db.mysql.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity(name = "com.praktikum.demo.db.mysql.entity.TbMasterSupplier")
@Table(name = "tb_master_supplier")
public class TbMasterSupplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"tbms_id\"", nullable = false)
    private Long tbmaId;
    @Column(name = "\"tbms_created_date\"", nullable = true)
    private Timestamp tbmsCreatedDate;
    @Column(name = "\"tbms_name\"", nullable = true)
    private String tbmsName;
    @Column(name = "\"tbms_jenis_supplier\"", nullable = true)
    private String tbmsJenisSupplier;
    @Column(name = "\"tbms_status\"", nullable = true)
    private Boolean tbmsStatus;


}
