package org.example;

import java.util.ArrayList;
import java.util.Scanner;


class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;


    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Salário Base: R$ " + salarioBase;
    }
}


class FuncionarioTempoIntegral extends Funcionario {
    private double bonus; // percentual do salário base

    // Construtor
    public FuncionarioTempoIntegral(String nome, String cpf, double salarioBase, double bonus) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    @Override
    public double calcularSalario() {
        return getSalarioBase() * (1 + bonus / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", Bônus: " + bonus + "%, Salário Total: R$ " + calcularSalario();
    }
}


class FuncionarioMeioPeriodo extends Funcionario {
    private int horasTrabalhadas;
    private double valorPorHora;


    public FuncionarioMeioPeriodo(String nome, String cpf, int horasTrabalhadas, double valorPorHora) {
        super(nome, cpf, 0); // O salário base não é usado diretamente
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }


    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    // Método para calcular o salário com base nas horas trabalhadas
    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }

    @Override
    public String toString() {
        return super.toString() + ", Horas Trabalhadas: " + horasTrabalhadas + ", Valor por Hora: R$ " + valorPorHora + ", Salário Total: R$ " + calcularSalario();
    }
}


class Estagiario extends Funcionario {
    private String instituicaoEnsino;
    private double bolsaAuxilio;


    public Estagiario(String nome, String cpf, String instituicaoEnsino, double bolsaAuxilio) {
        super(nome, cpf, 0); // O salário base não é usado diretamente
        this.instituicaoEnsino = instituicaoEnsino;
        this.bolsaAuxilio = bolsaAuxilio;
    }


    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public double getBolsaAuxilio() {
        return bolsaAuxilio;
    }

    public void setBolsaAuxilio(double bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }


    @Override
    public double calcularSalario() {
        return bolsaAuxilio;
    }

    @Override
    public String toString() {
        return super.toString() + ", Instituição de Ensino: " + instituicaoEnsino + ", Bolsa Auxílio: R$ " + calcularSalario();
    }
}

