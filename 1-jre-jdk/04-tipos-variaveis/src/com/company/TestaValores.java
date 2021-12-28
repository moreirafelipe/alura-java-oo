package com.company;

public class TestaValores {
    public static void main(String[] args) {
        //Teste - demonstra como o valor de String é armazenado

        int primeiro = 5;
        int segundo = 7;

        segundo = primeiro;
        primeiro = 10;

        //Quanto vale o segundo?
        System.out.println(segundo);
    }
}
