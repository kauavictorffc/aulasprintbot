package com.example.tratamentoapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TratamentoController {

    @GetMapping("/formatar")
    public String formatar(
            @RequestParam(required = false, defaultValue = "Sr.") String tratamento,
            @RequestParam(required = false, defaultValue = "Usuário") String nome,
            @RequestParam(required = false, defaultValue = "Desconhecido") String sobrenome) {
        
        // Verifica se o sobrenome e nome não estão vazios
        if (nome == null || nome.isEmpty()) {
            nome = "Usuário";
        }
        if (sobrenome == null || sobrenome.isEmpty()) {
            sobrenome = "Desconhecido";
        }
        
        // Formata a resposta como: (tratamento; sobrenome, nome)
        return String.format("(%s; %s, %s)", tratamento, sobrenome, nome);
    }
}
