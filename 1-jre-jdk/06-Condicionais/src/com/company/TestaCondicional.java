package com.company;

public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("Testando condicionais!");

        int qtdPessoas = 3;
        int idade = 16;

        if(idade >= 18) {
            System.out.println("Você tem mais de 18 anos!");
            System.out.println("Seja bem-vindo");
        } else if(qtdPessoas >= 2) {
            System.out.println("Você não tem mais de 18 mas pode entrar, pois está acompanhado!");
        } else {
            System.out.println("Infelizmente você não pode entrar!");
        }
    }
}
