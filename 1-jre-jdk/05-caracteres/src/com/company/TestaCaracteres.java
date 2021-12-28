package com.company;

public class TestaCaracteres {
    public static void main(String[] args) {

        char letra = 'a';
        System.out.println(letra);

        char valor = 65;//possível pois char é um número - Letra A na tabela ASCII
        System.out.println(valor);

        valor = (char) (valor + 1);//Letra B
        System.out.println(valor);

        String palavra = "Alura cursos online de tecnologia";
        System.out.println(palavra);

        palavra += 2020;
        System.out.println(palavra);
    }
}
