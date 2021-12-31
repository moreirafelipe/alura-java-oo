package com.company;

public class TestePratica {
    public static void main(String[] args) {

        Conta contaDaMarcela = new Conta(123,123);
        contaDaMarcela.setTitular( new Cliente());

        contaDaMarcela.getTitular().setNome("Marcela");

        System.out.println(contaDaMarcela.getTitular().getNome());
    }
}
