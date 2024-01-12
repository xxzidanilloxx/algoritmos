package com.danillo.algoritmos.lista08;

public class Exercicio73 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int x = 9;

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = x;
            x = x - 1;
        }

        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}
