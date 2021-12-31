package com.company;

public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta(123, 123);
        primeiraConta.setSaldo(200);
        System.out.println(primeiraConta.getSaldo());

        primeiraConta.setSaldo(primeiraConta.getSaldo()+ 100);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta(456,456);
        segundaConta.setSaldo(50);

        System.out.println("Primeira conta tem: " + primeiraConta.getSaldo());
        System.out.println("Segunda conta tem: " + segundaConta.getSaldo());
    }
}
