package com.company;

public class TestaMetodo {

    public static void main(String[] args) {

        Conta contaDoPaulo = new Conta(123,123);
        contaDoPaulo.setSaldo(100);
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.getSaldo());

        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.getSaldo());
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta(456,546);
        contaDaMarcela.deposita(1000);

        boolean sucessoTransferencia = contaDaMarcela.transfere(1200, contaDoPaulo); //Falta dinheiro
        if(sucessoTransferencia) {
            System.out.println("transferencia com sucesso");
        } else {
            System.out.println("faltou dinheiro");

        }
        System.out.println(contaDaMarcela.getSaldo());
        System.out.println(contaDoPaulo.getSaldo());
    }
}
