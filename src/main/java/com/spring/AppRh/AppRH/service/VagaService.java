package com.spring.AppRh.AppRH.service;

import com.spring.AppRh.AppRH.model.Vaga;
import com.spring.AppRh.AppRH.repository.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VagaService {
    @Autowired
    private VagaRepository vagaRepository;

    //cadastrar vaga
    public Vaga save(Vaga vaga){
        return vagaRepository.save(vaga);
    }



}
