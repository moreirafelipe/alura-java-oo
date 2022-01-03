package com.company;

public class Designer extends Funcionario{

    public Designer(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public Designer() {
    }

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do Designer");
        return super.getSalario() * 0.1 + 100;
    }
}
