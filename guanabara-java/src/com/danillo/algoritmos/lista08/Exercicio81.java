package com.danillo.algoritmos.lista08;

import java.util.Scanner;

public class Exercicio81 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[8];

        int somaIdade = 0;
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Insira a idade de uma pessoa: ");
            vetor[i] = entrada.nextInt();

            somaIdade = somaIdade + vetor[i];
        }
        float mediaIdade = (float)somaIdade/vetor.length;
        System.out.println("Média de idade: " +mediaIdade);

        System.out.print("Posições do vetor com pessoas acima de 25 anos: ");
        for(int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 25) {
                System.out.print(i+ " ");
            }
        }
        System.out.println();

        int maiorIdade = vetor[0];
        for(int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maiorIdade) {
                maiorIdade = vetor[i];
            }
        }
        System.out.println("Maior idade digitada: " +maiorIdade);

        System.out.print("Posição do vetor com a maior idade digitada: ");
        for(int i = 0; i < vetor.length; i++) {
            if (vetor[i] == maiorIdade) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
