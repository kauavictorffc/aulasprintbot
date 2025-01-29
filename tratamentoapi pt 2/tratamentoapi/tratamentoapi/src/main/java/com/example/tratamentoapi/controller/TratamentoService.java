package com.example.tratamentoapi.controller;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class TratamentoService {

    // Operações Básicas
    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: Divisão por zero.");
        }
        return a / b;
    }

    // Operações Avançadas
    public double radiciar(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Erro: Não é possível tirar a raiz de um número negativo.");
        }
        return Math.sqrt(a);
    }

    public double exponenciar(double a, double b) {
        return Math.pow(a, b);
    }

    public double inverso(double a) {
        if (a == 0) {
            throw new ArithmeticException("Erro: Não é possível calcular o inverso de 0.");
        }
        return 1 / a;
    }

    public double modulo(double a, double b) {
        return a % b;
    }

    public double fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Erro: Não é possível calcular o fatorial de um número negativo.");
        }
        return (n == 0 || n == 1) ? 1 : n * fatorial(n - 1);
    }

    public double media(double a, double b, double c, double d, double e) {
        return (a + b + c + d + e) / 5;
    }

    public double mediana(double a, double b, double c, double d, double e) {
        double[] valores = {a, b, c, d, e};
        Arrays.sort(valores);  // Ordena os valores
        return valores[2];     // Retorna o valor do meio
    }
}
