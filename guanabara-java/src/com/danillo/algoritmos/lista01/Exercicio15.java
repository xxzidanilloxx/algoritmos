package com.danillo.algoritmos.lista01;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o número de dias trabalhados: ");
        int diasTrabalhados = entrada.nextInt();

        int dia = 8 * 25;
        int salario = diasTrabalhados * dia;
        System.out.println("Salário: R$ " +salario);
    }
}
