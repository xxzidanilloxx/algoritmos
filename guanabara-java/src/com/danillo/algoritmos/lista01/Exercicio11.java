package com.danillo.algoritmos.lista01;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o valor de a: ");
        int a = entrada.nextInt();
        System.out.println("Insira o valor de b: ");
        int b = entrada.nextInt();
        System.out.println("Insira o valor de c: ");
        int c = entrada.nextInt();

        int delta = (b*b) - 4 * a * c;
        System.out.println("O valor de delta é: " +delta);
    }
}
