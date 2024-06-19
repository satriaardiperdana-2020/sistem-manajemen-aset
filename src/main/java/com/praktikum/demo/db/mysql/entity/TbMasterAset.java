package com.praktikum.demo.db.mysql.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity(name = "com.praktikum.demo.db.mysql.entity.TbMasterAset")
@Table(name = "tb_master_aset")
public class TbMasterAset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"tbma_id\"", nullable = false)
    private Long tbmaId;
    @Column(name = "\"tbma_created_date\"", nullable = true)
    private Timestamp tbmaCreatedDate;
    @Column(name = "\"tbma_nama\"", nullable = false)
    private String tbmaNama;
    @Column(name = "\"tbma_status\"", nullable = false)
    private Boolean tbmaStatus;
    @Column(name = "\"tbma_qty\"", nullable = false)
    private Integer tbmaQty;
    @Column(name = "\"tbma_tbms_id\"", nullable = false)
    private Integer tbmaTbmsId;


}
