package com.company;

public class TestaCondicional2 {

    public static void main(String[] args) {
        System.out.println("Testando condicionais!");

        int qtdPessoas = 3;
        int idade = 16;

        boolean acompanhado = qtdPessoas >= 2;

        System.out.println("Valor de acompanhado = " + acompanhado);

        if(idade >= 18 && acompanhado) {
            System.out.println("Seja bem-vindo");
        } else {
            System.out.println("Infelizmente você não pode entrar!");
        }
    }
}
