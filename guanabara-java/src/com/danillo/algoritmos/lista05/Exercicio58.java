package com.danillo.algoritmos.lista05;

import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0;

        while(true){
            System.out.println("Insira a idade do aluno: ");
            int idade = entrada.nextInt();

            if (idade == 999){
                break;
            }

            soma = soma + idade;
        }
        System.out.println("Soma da idade do grupo: " +soma);
    }
}
