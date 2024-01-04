package com.danillo.algoritmos.lista04;

import java.util.Scanner;

public class Exercicio52 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i = 0, soma = 0, maior18 = 0, menor5 = 0, maiorIdade = 0;

        while(i < 10){
            System.out.println("Insira a idade de uma pessoa: ");
            int idade = entrada.nextInt();

            soma = soma + idade;

            if(idade>18){
                maior18++;
            }

            if(idade<5){
                menor5++;
            }

            if(idade > maiorIdade){
                maiorIdade = idade;
            }

            i++;
        }

        float media = soma/10f;

        System.out.println("Média de idade do grupo: " +media+
                           "\nQuantidade de pessoas maiores de 18 anos: " +maior18+
                           "\nQuantidade de pessoas menores de 5 anos: " +menor5+
                           "\nMaior idade no grupo: " +maiorIdade+ " anos");
    }
}
