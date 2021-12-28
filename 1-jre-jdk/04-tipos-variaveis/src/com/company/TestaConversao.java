package com.company;

public class TestaConversao {
    public static void main(String[] args) {

        //int -> 4 bytes	-2.147.483.648 to 2.147.483.647
        double salario = 1270.50;

        //int -> 4 bytes	-2.147.483.648 to 2.147.483.647
        int valor = (int) salario; //Casting - tipo primitivo int

        System.out.println(valor);

        //Exemplos
        //long	8 bytes	-9.223.372.036.854.775.808	9.223.372.036.854.775.807
        long numeroGrande = 32432423423L;

        //short	2 byte	-32.768	32.767
        short valorPequeno = 2131;

        //byte	1 byte	-128	127
        byte b = 127;

        double valor1 = 0.2;
        double valor2 = 0.1;

        double total = valor1 + valor2;

        //Output without formating
        System.out.println(total);
    }
}

//References:
//https://ieeexplore.ieee.org/document/8766229
//https://standards.ieee.org/standard/754-2019.html