package com.danillo.algoritmos.lista01;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o valor do salário: ");
        float salario = entrada.nextFloat();

        float aumento = salario * 15/100;
        float novoSalario = salario + aumento;
        System.out.println("Salário antigo: R$ " + salario+ "\nSalário reajustado (+15%): R$" +novoSalario);
    }
}
