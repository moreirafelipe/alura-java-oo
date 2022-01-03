package com.company;

public class Gerente extends Funcionario {

    private int senha;

    public Gerente(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public Gerente(){};

    public boolean setSenha(int senha) {

        if(this.senha == senha) {
         return true;
        } else {
         return false;
        }
    }

    public double getBonificacao() {
        System.out.println("Chamando o método bonificacao do GERENTE");
        return super.getSalario() * 1.1;
    }
}
