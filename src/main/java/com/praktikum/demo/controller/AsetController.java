package com.praktikum.demo.controller;

import com.praktikum.demo.db.mysql.entity.TbMasterAset;
import com.praktikum.demo.service.AsetService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@Slf4j
@RestController
@RequestMapping(value ="/asset", produces = "application/json")
@RequiredArgsConstructor
public class AsetController {
    @Autowired
    private AsetService asetService;
    // @CrossOrigin(origins = "*")
    @GetMapping("/get-aset")
    public List<TbMasterAset> reqAset(){
        return asetService.getAllDataAset();
    }

    @GetMapping("/get-aset/{id}")
    public TbMasterAset reqAsetById(@PathVariable Long id){
        return asetService.getDataAsetById(id);
    }

    @PostMapping("/save-aset")
    public TbMasterAset createAset(@RequestBody TbMasterAset tbMasterAset) {
        return asetService.createAset(tbMasterAset);
    }
    @DeleteMapping("/delete-aset/{id}")
    public void deleteAset(@PathVariable Long id) {
        asetService.deleteAsetById(id);
    }

    //LATIHAN JIKA TANPA MAGIC QUERY
    @GetMapping("/get-aset-query")
    public List<TbMasterAset> reqAsetQuery(){
        return asetService.getAllDataAsetQuery();
    }
}
