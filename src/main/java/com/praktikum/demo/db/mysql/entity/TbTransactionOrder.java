package com.praktikum.demo.db.mysql.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tb_transaction_order")
public class TbTransactionOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tbto_id", nullable = false)
    private Integer id;

    @Column(name = "tbto_created_date")
    private Timestamp tbtoCreatedDate;

    @Column(name = "tbto_tbma_id")
    private Long tbtoTbma;

    @Column(name = "tbto_tbms_id")
    private Long tbtoTbms;

    @Column(name = "tbto_qty_pesan")
    private Integer tbtoQtyPesan;

    @Column(name = "tbto_status")
    private Boolean tbtoStatus;

}