package com.danillo.algoritmos.lista05;

import java.util.Scanner;

public class Exercicio59 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int maiorIdade = 0, homensCadastrados = 0, mulherMaisJovem = Integer.MAX_VALUE, somaIdadeHomens = 0;
        char continuar = 'S';

        while(continuar == 'S'){
            System.out.println("Insira a idade: ");
            int idade = entrada.nextInt();
            System.out.println("Insira o gênero: ");
            char genero = entrada.next().charAt(0);

            if(idade > maiorIdade){
                maiorIdade = idade;
            }

            if (genero == 'M'){
                somaIdadeHomens = somaIdadeHomens + idade;
                homensCadastrados++;
            }

            if (genero == 'F' && idade < mulherMaisJovem){
                mulherMaisJovem = idade;
            }

            System.out.println("Deseja continuar? (S ou N)");
            continuar = entrada.next().charAt(0);
        }

        float mediaIdadeHomens = (float)somaIdadeHomens/homensCadastrados;

        System.out.println("Maior idade: " +maiorIdade+
                           "\nQuantidade de homens cadastrados: " +homensCadastrados+
                           "\nIdade da mulher mais jovem: " +mulherMaisJovem+
                           "\nMédia de idade entre os homens:" +mediaIdadeHomens);
    }
}
