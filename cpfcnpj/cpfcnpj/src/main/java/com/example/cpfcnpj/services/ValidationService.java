package com.example.cpfcnpj.services;

import org.springframework.stereotype.Service;

@Service
public class ValidationService {

    public boolean validateCPF(String cpf) {
        cpf = cpf.replaceAll("[^\\d]", "");

        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        return isValidCPF(cpf);
    }

    public boolean validateCNPJ(String cnpj) {
        cnpj = cnpj.replaceAll("[^\\d]", "");

        if (cnpj.length() != 14 || cnpj.matches("(\\d)\\1{13}")) {
            return false;
        }

        return isValidCNPJ(cnpj);
    }

    private boolean isValidCPF(String cpf) {
        int digito1 = calcularDigitoVerificador(cpf.substring(0, 9), new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2});
        int digito2 = calcularDigitoVerificador(cpf.substring(0, 9) + digito1, new int[]{11, 10, 9, 8, 7, 6, 5, 4, 3, 2});
        
        return cpf.equals(cpf.substring(0, 9) + digito1 + digito2);
    }

    private boolean isValidCNPJ(String cnpj) {
        int digito1 = calcularDigitoVerificador(cnpj.substring(0, 12), new int[]{5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2});
        int digito2 = calcularDigitoVerificador(cnpj.substring(0, 12) + digito1, new int[]{6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2});

        return cnpj.equals(cnpj.substring(0, 12) + digito1 + digito2);
    }

    private int calcularDigitoVerificador(String str, int[] peso) {
        int soma = 0;
        for (int i = 0; i < peso.length; i++) {
            soma += (str.charAt(i) - '0') * peso[i];
        }
        int resto = soma % 11;
        return (resto < 2) ? 0 : 11 - resto;
    }
}
