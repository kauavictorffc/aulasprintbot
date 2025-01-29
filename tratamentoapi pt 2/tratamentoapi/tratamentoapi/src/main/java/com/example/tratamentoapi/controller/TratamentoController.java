package com.example.tratamentoapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tratamento")
public class TratamentoController {

    @Autowired
    private TratamentoService tratamentoService;

    // Operações Básicas
    @GetMapping("/soma")
    public double somar(@RequestParam double a, @RequestParam double b) {
        return tratamentoService.somar(a, b);
    }

    @GetMapping("/subtrair")
    public double subtrair(@RequestParam double a, @RequestParam double b) {
        return tratamentoService.subtrair(a, b);
    }

    @GetMapping("/multiplicar")
    public double multiplicar(@RequestParam double a, @RequestParam double b) {
        return tratamentoService.multiplicar(a, b);
    }

    @GetMapping("/dividir")
    public double dividir(@RequestParam double a, @RequestParam double b) {
        return tratamentoService.dividir(a, b);
    }

    // Operações Avançadas
    @GetMapping("/radiciacao")
    public double radiciar(@RequestParam double a) {
        return tratamentoService.radiciar(a);
    }

    @GetMapping("/exponenciacao")
    public double exponenciar(@RequestParam double a, @RequestParam double b) {
        return tratamentoService.exponenciar(a, b);
    }

    @GetMapping("/inverso")
    public double inverso(@RequestParam double a) {
        return tratamentoService.inverso(a);
    }

    @GetMapping("/modulo")
    public double modulo(@RequestParam double a, @RequestParam double b) {
        return tratamentoService.modulo(a, b);
    }

    @GetMapping("/fatorial")
    public double fatorial(@RequestParam int n) {
        return tratamentoService.fatorial(n);
    }

    @GetMapping("/media")
    public double media(@RequestParam double a, @RequestParam double b, @RequestParam double c,
                         @RequestParam double d, @RequestParam double e) {
        return tratamentoService.media(a, b, c, d, e);
    }

    @GetMapping("/mediana")
    public double mediana(@RequestParam double a, @RequestParam double b, @RequestParam double c,
                           @RequestParam double d, @RequestParam double e) {
        return tratamentoService.mediana(a, b, c, d, e);
    }
}
