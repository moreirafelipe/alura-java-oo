package com.company;

public class LacosEncadeados {

    public static void main(String[] args) {
        for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            System.out.println("Tabuada do " + multiplicador);
            for(int multiplicado = 0; multiplicado <= 10; multiplicado++) {
                System.out.print(multiplicador * multiplicado);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
