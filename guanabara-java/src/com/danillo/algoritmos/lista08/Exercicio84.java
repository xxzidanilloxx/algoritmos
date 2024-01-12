package com.danillo.algoritmos.lista08;

import java.util.Scanner;

public class Exercicio84 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] vetor1 = new String[5];
        int[] vetor2 = new int[5];

        for(int i=0; i< 5; i++){
            System.out.println("Insira o nome: ");
            vetor1[i] = entrada.nextLine();

            System.out.println("Insira a idade: ");
            vetor2[i] = entrada.nextInt();

            entrada.nextLine();
        }

        System.out.println("Pessoas menores de 18 anos: ");
        for(int i=0; i < 5; i++){
            if(vetor2[i] < 18){
                System.out.println("Nome: " +vetor1[i]+ " Idade:" +vetor2[i]);
            }
        }
    }
}
