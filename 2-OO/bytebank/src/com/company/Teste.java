package com.company;

public class Teste {
    public static void main(String[] args) {
        Conta minhaConta = new Conta(123,123);
        minhaConta.setSaldo(500.0);
        Conta outraConta = minhaConta;
        outraConta.setSaldo(outraConta.getSaldo() + 1000.0);
        System.out.println(minhaConta.getSaldo());
    }
}
