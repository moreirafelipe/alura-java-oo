package com.company;

public class TestaPontoFlutuante {

    public static void main(String[] args) {
        double salario;
        salario = 1250.70;
        System.out.println("Meu salário é: " + salario);

        double idade = 37;
        double divisao = 3.14/2;

        System.out.println(divisao);

        //Resulta em inteiro: 2
        int outraDivisao = 5 / 2;
        System.out.println(outraDivisao);

        //Resulta em double: 2.0
        double doubleDivisao1 = 5 / 2;
        System.out.println(doubleDivisao1);


        //Resulta em double: 2.5 - usa maior range de tipos - no caso o Double
        double doubleDivisao2 = 5.0 / 2;
        System.out.println(doubleDivisao2);
    }
}
