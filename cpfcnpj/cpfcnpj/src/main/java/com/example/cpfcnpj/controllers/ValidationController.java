package com.example.cpfcnpj.controllers;

import com.example.cpfcnpj.services.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ValidationController {

    @Autowired
    private ValidationService validationService;

    @GetMapping("/CPF/{cpf}")
    public boolean validateCPF(@PathVariable String cpf) {
        return validationService.validateCPF(cpf);
    }

    @GetMapping("/CNPJ/{cnpj}")
    public boolean validateCNPJ(@PathVariable String cnpj) {
        return validationService.validateCNPJ(cnpj);
    }
}
