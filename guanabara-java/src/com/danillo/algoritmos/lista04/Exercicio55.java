package com.danillo.algoritmos.lista04;

import java.util.Random;
import java.util.Scanner;

public class Exercicio55 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        int i=0, numero = aleatorio.nextInt(10);

        while(i < 4){
            System.out.println("Tente adivinhar o número mágico de 1 a 10: ");
            int chute = entrada.nextInt();

            if (chute == numero){
                System.out.println("Acertou!");
                break;
            } else {
                System.out.println("Errou!");
            }

            i++;
        }
    }
}
