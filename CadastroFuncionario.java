package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaFuncionario {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Cadastro de Funcionários:");


        funcionarios.add(new FuncionarioTempoIntegral("Kaiki", "123.456.789-00", 5000, 10));


        funcionarios.add(new FuncionarioMeioPeriodo("Joao lindo chroma", "987.654.321-00", 80, 20));


        funcionarios.add(new Estagiario("Pedro", "321.654.987-00", "Universidade X", 1500));


        System.out.println("\nInformações dos Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
            System.out.println("Salário Calculado: R$ " + funcionario.calcularSalario() + "\n");
        }

        scanner.close();
    }
}
