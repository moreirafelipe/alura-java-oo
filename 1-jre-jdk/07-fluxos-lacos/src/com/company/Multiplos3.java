package com.company;

public class Multiplos3 {
    public static void main(String[] args) {
        for(int contador = 1; contador <= 100; contador++){
            if(contador % 3 == 0)
                System.out.print(contador + " | ");
        }
    }
}
