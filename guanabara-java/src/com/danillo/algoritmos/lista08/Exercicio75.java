package com.danillo.algoritmos.lista08;

public class Exercicio75 {
    public static void main(String[] args) {
        int[] vetor = new int[15];
        int primeiro = 0, proximo = 1;

        for(int i = 0; i< vetor.length; i++){
            int fibonacci = primeiro + proximo;
            vetor[i] = fibonacci;
            primeiro = proximo;
            proximo = fibonacci;
        }

        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}
