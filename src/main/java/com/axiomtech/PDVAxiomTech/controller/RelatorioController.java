package com.axiomtech.PDVAxiomTech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RelatorioController {
    @GetMapping
    public String relatorio(){
        return "html de relatorio";
    }
}
