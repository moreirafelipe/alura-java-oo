package com.company;

public class TesteIR {

    public static void main(String[] args) {

        double salario = 3300.0;

        if(salario >= 1900 && salario <= 2800)
            System.out.println("Aliquota IR: 7,5% - Dedução: R$ 142,00");
        if(salario >= 2800.01 && salario <= 3751)
            System.out.println("Aliquota IR: 15% - Dedução: R$ 350,00");
        if(salario >= 3751.01 && salario <= 4664)
            System.out.println("Aliquota IR: 22.5% - Dedução: R$ 636,00");
    }
}
