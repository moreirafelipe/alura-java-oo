package com.company;

public class TesteSacaNegativo {

    public static void main(String[] args) {
        Conta conta = new Conta(456,456);
        conta.deposita(100.0);
        System.out.println(conta.saca(101.0));
        System.out.println(conta.getSaldo());
    }
}
