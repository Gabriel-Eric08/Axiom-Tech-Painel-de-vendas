package com.axiomtech.PDVAxiomTech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venda")
public class VendaController {
    @GetMapping
    public String vendaPage(){
        return "Retorna HTML da página de vendas";
    }
    @PostMapping
    public String cadastrarVenda(){
        return "Envia as informações do pedido para a rota de cadastro de pedidos da outra aplicação";
    }
    @PostMapping("/cancelar")
    public String cancelarVenda(){
        return "Envia o id da venda e cancela a venda";
    }
}
