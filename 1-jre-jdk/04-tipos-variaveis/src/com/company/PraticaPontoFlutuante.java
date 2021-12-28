package com.company;

//1 Crie uma classe "TestaPontoFlutuante" e estruture seu método main.
public class PraticaPontoFlutuante {

    public static void main(String[] args) {

        //2 Crie uma classe "TestaPontoFlutuante" e estruture seu método main.
        double salario = 1250.70;

        //3) Imprima a variável salario e verifique se o valor está correto, Nosso código deve ficar assim:
        //4) Utilize o + para concatenar a variável salario com um texto:
        System.out.println("Meu salári é: " + salario);

        //5) Lembre-se que não podemos colocar um valor com ponto flutuante dentro de uma variável do tipo int, teste:
//        int valor = 12.5; //não compila.
//        int valor2 = 0.0; //não compila.
        double teste = 125.50; //não compila.
//        int valor3 = teste; //não compila.

        //6) Teste também um cálculo de divisão:
        int divisao = 5/2;
        System.out.println(divisao);

        //7) Para resolver o problema, coloque em um dos valores da divisão com alguma casa decimal, além de mudar o tipo da variável para double:
        double divisao2 = 5.0/2;
        System.out.println(divisao2);
    }
}
