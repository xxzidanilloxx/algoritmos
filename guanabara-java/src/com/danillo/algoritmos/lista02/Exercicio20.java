package com.danillo.algoritmos.lista02;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int x = entrada.nextInt();

        if(x % 2 == 0){
            System.out.println("O número " +x+ " é par.");
        } else {
            System.out.println("O número " +x+ " é ímpar.");
        }
    }
}
