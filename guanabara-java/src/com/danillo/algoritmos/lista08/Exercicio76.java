package com.danillo.algoritmos.lista08;

import java.util.Random;

public class Exercicio76 {
    public static void main(String[] args) {
        int[] vetor = new int[7];

        for(int i = 0; i < vetor.length; i++){
            Random aleatorio = new Random();
            int x = aleatorio.nextInt(100);
            vetor[i] = x;
        }

        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}
