package com.danillo.algoritmos.lista04;

import java.util.Scanner;

public class Exercicio53 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i = 0, mulheresCadastradas = 0, homensCadastrados = 0, mulheresMais20 = 0, soma = 0, somaHomens = 0;

        while(i < 5){
            System.out.println("Insira o gênero (M ou F): ");
            char genero = entrada.next().charAt(0);
            System.out.println("Insira a idade: ");
            int idade = entrada.nextInt();

            if(genero == 'F'){
                mulheresCadastradas++;
            }else{
                homensCadastrados++;
            }

            if(genero == 'F' && idade > 20){
                mulheresMais20++;
            }

            soma = soma + idade;

            if(genero == 'M'){
                somaHomens = somaHomens + idade;
            }

            i++;
        }

        float media = soma/5f;
        float mediaHomens = (float) somaHomens /homensCadastrados;

        System.out.println("Quantos homens foram cadastrados? " +homensCadastrados+
                           "\nQuantas mulheres foram cadastradas? " +mulheresCadastradas+
                           "\nMédia de idade do grupo: " +media+
                           "\nMédia de idade dos homens: " +mediaHomens+
                           "\nQuantas mulheres tem mais de 20 anos? " +mulheresMais20);
    }
}
