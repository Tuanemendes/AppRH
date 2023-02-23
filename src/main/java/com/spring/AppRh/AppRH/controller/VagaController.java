package com.spring.AppRh.AppRH.controller;

import com.spring.AppRh.AppRH.model.Vaga;
import com.spring.AppRh.AppRH.service.VagaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cadastrarVaga")
public class VagaController {
    @Autowired
    private VagaService vagaService;
    @PostMapping
    public ResponseEntity<Vaga> saveVaga(@RequestBody Vaga vaga){
        return ResponseEntity.ok().body(vagaService.save(vaga));

    }

}

