package com.danillo.algoritmos.lista08;

import java.util.Scanner;

public class Exercicio79 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Insira um número: ");
            vetor[i] = entrada.nextInt();
        }

        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 == 0){
                System.out.println("Posição: " +i+ " Elemento: " +vetor[i]);
            }
        }
    }
}
