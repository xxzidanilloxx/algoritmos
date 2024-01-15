package com.danillo.algoritmos.lista08;

import java.util.Random;

public class Exercicio83 {
    public static void main(String[] args){
        int[] vetor = new int[5];

        for(int i = 0; i < vetor.length; i++){
            Random aleatorio = new Random();
            int x = aleatorio.nextInt(99);
            vetor[i] = x;
        }

        System.out.println("Vetor desordenado: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }

        System.out.println("Vetor ordenado: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}
