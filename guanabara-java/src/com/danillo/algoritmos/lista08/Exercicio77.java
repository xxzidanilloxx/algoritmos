package com.danillo.algoritmos.lista08;

import java.util.Scanner;

public class Exercicio77 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] vetor = new String[7];

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Insira um nome: ");
            vetor[i] = entrada.nextLine();
        }

        for(int i = vetor.length - 1; i >= 0; i--){
            System.out.println(vetor[i]);
        }
    }
}
