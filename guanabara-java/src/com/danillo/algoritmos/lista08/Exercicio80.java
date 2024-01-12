package com.danillo.algoritmos.lista08;

import java.util.Random;
import java.util.Scanner;

public class Exercicio80 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[30];

        for(int i = 0; i < vetor.length; i++){
            Random aleatorio = new Random();
            vetor[i] = aleatorio.nextInt(15)+1;
        }

        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

        System.out.println("Insira um número de 1 a 15: ");
        int x = entrada.nextInt();

        for(int i = 0; i < vetor.length; i++){
            if(x == vetor[i]){
                System.out.println("Posição: " +i+ " Número: " +vetor[i]);
            }
        }
    }
}
