package com.company;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular seu fatorial: ");
        int data = scan.nextInt();

        int fatorial = 1;

        for(int n = 1; n <= data; n++){
            fatorial *= n;
        }

        System.out.println("Fatorial de " + data + " é igual a " + fatorial);
    }
}
