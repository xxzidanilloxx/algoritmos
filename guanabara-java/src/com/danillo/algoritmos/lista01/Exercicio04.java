package com.danillo.algoritmos.lista01;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        int a = entrada.nextInt();
        System.out.println("Insira outro número inteiro: ");
        int b = entrada.nextInt();

        int soma = a + b;
        System.out.println("A soma entre " +a+ " e " +b+ " é igual a " +soma);
    }
}
