package com.danillo.algoritmos.lista04;

public class Exercicio47 {
    public static void main(String[] args) {
        int i = 500;
        int soma = 0;

        while(i >= 0){
            System.out.println(i);

            soma = soma + i;

            i = i -50;
        }

        System.out.println("Soma: " +soma);
    }
}
