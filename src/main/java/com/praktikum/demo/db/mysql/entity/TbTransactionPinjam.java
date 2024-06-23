package com.praktikum.demo.db.mysql.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tb_transaction_pinjam")
public class TbTransactionPinjam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tbtp_id", nullable = false)
    private Integer id;

    @Column(name = "tbtp_created_date")
    private Timestamp tbtpCreatedDate;

    @Column(name = "tbtp_tbma_id")
    private Long tbtpTbma;

    @Column(name = "tbtp_tbmp_id")
    private Long tbtpTbmp;

    @Column(name = "tbtp_status")
    private Boolean tbtpStatus;

}