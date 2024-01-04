package com.danillo.algoritmos.lista04;

public class Exercicio46 {
    public static void main(String[] args) {
        int i = 6;
        int soma = 0;

        while (i <= 100){
            System.out.println(i);

            soma = soma + i;

            i = i + 2;
        }

        System.out.println("Soma: " +soma);
    }
}
