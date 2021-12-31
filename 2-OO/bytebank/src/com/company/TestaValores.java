package com.company;

public class TestaValores {
    public static void main(String[] args) {

        Conta conta = new Conta(123,123);

        //Objeto Conta está inconsistente
        conta.setAgencia(-30);
        conta.setNumero(-330);

        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());
    }
}
