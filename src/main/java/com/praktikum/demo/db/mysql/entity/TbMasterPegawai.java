package com.praktikum.demo.db.mysql.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.Instant;

@Data
@Entity(name = "com.praktikum.demo.db.mysql.entity.TbMasterPegawai")
@Table(name = "tb_master_pegawai")
public class TbMasterPegawai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"tbmp_id\"", nullable = false)
    private Long tbmpId;

    @Column(name = "tbmp_created_date")
    private Instant tbmpCreatedDate;

    @Size(max = 50)
    @Column(name = "tbmp_name", length = 50)
    private String tbmpName;

    @Size(max = 50)
    @Column(name = "tbmp_alamat", length = 50)
    private String tbmpAlamat;

    @Size(max = 50)
    @Column(name = "tbmp_phone", length = 50)
    private String tbmpPhone;

    @Column(name = "tbmp_status")
    private Boolean tbmpStatus;

}
