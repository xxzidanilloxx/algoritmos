package com.danillo.algoritmos.lista06;

import java.util.Scanner;

public class Exercicio62 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidadeIdadesDigitadas = 0, soma = 0, pessoasCom21AnosOuMais = 0;
        char continuar;

        do{
            System.out.println("Insira a idade: ");
            int idade = entrada.nextInt();

            if(idade >= 21){
                pessoasCom21AnosOuMais++;
            }

            soma = soma + idade;
            quantidadeIdadesDigitadas++;

            System.out.println("Deseja continuar? (S ou N)");
            continuar = entrada.next().charAt(0);
        }while(continuar == 'S');

        float media = (float) soma/quantidadeIdadesDigitadas;

        System.out.println("Quantidade de idades digitadas: " +quantidadeIdadesDigitadas+
                           "\nMédia entre as idades digitadas: " +media+
                           "\nPessoas com 21 anos ou mais: " +pessoasCom21AnosOuMais);
    }
}
