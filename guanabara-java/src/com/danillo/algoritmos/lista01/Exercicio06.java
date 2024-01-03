package com.danillo.algoritmos.lista01;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int x = entrada.nextInt();
        int antecessor = x-1;
        int sucessor = x+1;
        System.out.println("O antecessor de " +x+ " é: " +antecessor+ "\nO sucessor de " +x+ " é: " +sucessor);
    }
}
