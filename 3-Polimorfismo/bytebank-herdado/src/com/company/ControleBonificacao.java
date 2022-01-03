package com.company;

public class ControleBonificacao {

    //Sobrecarga de métodos que recebe cada tipo de funcionário
    private double soma;

    public void registra(Funcionario f) {
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return soma;
    }
}
