package com.danillo.algoritmos.lista07;

public class Exercicio70 {
    public static void main(String[] args) {
        int primeiro = 0, proximo = 1;

        for(int i = 0; i < 10; i++){
            int fibonacci = proximo + primeiro;
            System.out.println(fibonacci);
            primeiro = proximo;
            proximo = fibonacci;
        }
    }
}
