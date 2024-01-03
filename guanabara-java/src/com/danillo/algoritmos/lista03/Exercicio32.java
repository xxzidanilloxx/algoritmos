package com.danillo.algoritmos.lista03;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = 4;

        System.out.println("Tente adivinhar o número mágico de 1 a 5: ");
        int chute = entrada.nextInt();

        if (chute == numero){
            System.out.println("Acertou!");
        } else {
            System.out.println("Errou!");
        }
    }
}
