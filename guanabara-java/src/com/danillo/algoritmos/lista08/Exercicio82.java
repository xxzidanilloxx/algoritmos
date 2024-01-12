package com.danillo.algoritmos.lista08;

import java.util.Scanner;

public class Exercicio82 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] vetor = new float[10];

        float somaNotas = 0, maiorNota=0;
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Insira uma nota: ");
            vetor[i] = entrada.nextFloat();

            somaNotas = somaNotas + vetor[i];

            if(vetor[i] > maiorNota){
                maiorNota = vetor[i];
            }
        }
        float mediaNotas = somaNotas/vetor.length;

        int alunoAcimaMedia = 0;
        for(int i = 0; i< vetor.length; i++){
            if(vetor[i] > mediaNotas){
                alunoAcimaMedia++;
            }
        }

        System.out.println("Média das notas da turma: " +mediaNotas+
                           "\nAlunos acima da média da turma: " +alunoAcimaMedia+
                           "\nMaior nota da turma: " +maiorNota);

        System.out.print("Posição do vetor com a maior nota: ");
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == maiorNota){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }
}
