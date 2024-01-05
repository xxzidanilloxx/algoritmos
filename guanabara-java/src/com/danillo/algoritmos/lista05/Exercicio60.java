package com.danillo.algoritmos.lista05;

import java.util.Scanner;

public class Exercicio60 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nomePessoaMaisVelha = null, nomeMulherMaisJovem = null;
        int homensMais30anos = 0, mulherMaisJovem = Integer.MAX_VALUE, maiorIdade = 0, soma = 0, quantidadePessoas = 0;
        char continuar = 'S';

        while(continuar == 'S'){
            System.out.println("Insira o nome: ");
            String nome = entrada.nextLine();
            System.out.println("Insira a idade: ");
            int idade = entrada.nextInt();
            System.out.println("Insira o gênero: ");
            char genero = entrada.next().charAt(0);
            
            if (idade > maiorIdade){
                maiorIdade = idade;
                nomePessoaMaisVelha = nome;
            }
            
            if (genero == 'F' && idade < mulherMaisJovem){
                mulherMaisJovem = idade;
                nomeMulherMaisJovem = nome;
            }

            if(genero == 'M' && idade > 30){
                homensMais30anos++;
            }

            soma = soma + idade;
            quantidadePessoas++;

            System.out.println("Deseja continuar? (S ou N)");
            continuar = entrada.next().charAt(0);
            entrada.nextLine();
        }

        float mediaIdade = (float)soma/quantidadePessoas;

        System.out.println("Nome da pessoa mais velha: " +nomePessoaMaisVelha+
                           "\nNome da mulher mais jovem: " +nomeMulherMaisJovem+
                           "\nMédia de idade do grupo: " +mediaIdade+
                           "\nQuantidade de homens com mais de 30 anos: " +homensMais30anos);
    }
}
