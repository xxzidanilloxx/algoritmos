package com.danillo.algoritmos.lista08;

import java.util.Scanner;

public class Exercicio85 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] vetor1 = new String[5];
        float[] vetor2 = new float[5];
        char[] vetor3 = new char[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Insira o nome: ");
            vetor1[i] = entrada.nextLine();

            System.out.println("Insira o salário: ");
            vetor2[i] = entrada.nextFloat();

            System.out.println("Insira o gênero (M ou F): ");
            vetor3[i] = entrada.next().charAt(0);

            entrada.nextLine();
        }

        System.out.println("Mulheres que ganham mais de R$5 mil: ");
        for(int i = 0; i < 5; i++){
            if(vetor3[i] == 'F' && vetor2[i] > 5000){
                System.out.println("Nome: " +vetor1[i]+ " Salário: R$ " +vetor2[i]+ " Gênero: " +vetor3[i]);
            }
        }
    }
}
