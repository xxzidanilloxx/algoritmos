package com.danillo.algoritmos.lista08;

public class Exercicio72 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int x = 0;

        for(int i = 0; i < vetor.length; i++){
            x = x + 5;
            vetor[i] = x;
        }

        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}
