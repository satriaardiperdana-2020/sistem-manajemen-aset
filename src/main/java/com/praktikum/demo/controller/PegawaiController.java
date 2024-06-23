package com.praktikum.demo.controller;

import com.praktikum.demo.db.mysql.entity.TbMasterPegawai;
import com.praktikum.demo.service.PegawaiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value ="/pegawai", produces = "application/json")
@RequiredArgsConstructor
public class PegawaiController {

    @Autowired
    private PegawaiService pegawaiService;

    @GetMapping("/get-pegawai")
    public List<TbMasterPegawai> reqAset(){
        return pegawaiService.getAllDataPegawai();
    }

    @GetMapping("/get-pegawai/{id}")
    public TbMasterPegawai reqAsetById(@PathVariable Long id){
        return pegawaiService.getDataPegawaiById(id);
    }

    @PostMapping("/save-pegawai")
    public TbMasterPegawai createAset(@RequestBody TbMasterPegawai tbMasterPegawai) {
        return pegawaiService.createPegawai(tbMasterPegawai);
    }

    @DeleteMapping("/delete-pegawai/{id}")
    public void deletePegawai(@PathVariable Long id) {
        pegawaiService.deletePegawaiById(id);
    }
}