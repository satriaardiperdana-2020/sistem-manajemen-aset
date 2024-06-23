package com.praktikum.demo.controller;

import com.praktikum.demo.db.mysql.entity.TbTransactionPinjam;
import com.praktikum.demo.service.PinjamService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/pinjam", produces = "application/json")
@RequiredArgsConstructor
public class PinjamController {
    @Autowired
    private PinjamService pinjamService;

    @GetMapping("/get-pinjam")
    public List<TbTransactionPinjam> reqPinjam(){
        return pinjamService.getAllDataPinjam();
    }

    @GetMapping("/get-pinjam/{id}")
    public TbTransactionPinjam reqPinjamById(@PathVariable Long id){

        return pinjamService.getDataPinjamById(id);
    }

    @PostMapping("/save-pinjam")
    public TbTransactionPinjam createPinjam(@RequestBody TbTransactionPinjam tbTransactionPinjam) {
        return pinjamService.createPinjam(tbTransactionPinjam);
    }

    @DeleteMapping("/delete-pinjam/{id}")
    public void deletePinjam(@PathVariable Long id) {
        pinjamService.deletePinjamById(id);
    }

}
