package com.danillo.algoritmos.lista04;

import java.util.Scanner;

public class Exercicio54 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i = 0, pessoasComMais90Kg = 0, pessoasMenos50KgMenos160 = 0,pessoasMais100KgMais190 = 0;
        float soma = 0;

        while(i < 3){
            System.out.println("Insira o peso: ");
            float peso = entrada.nextFloat();
            System.out.println("Insira a altura: ");
            float altura = entrada.nextFloat();

            soma = soma + altura;

            if(peso > 90){
                pessoasComMais90Kg++;
            }

            if(peso < 50 && altura < 1.50){
                pessoasMenos50KgMenos160++;
            }

            if(peso > 100 && altura > 1.90){
                pessoasMais100KgMais190++;
            }

            i++;
        }

        float mediaAltura = soma / 3;

        System.out.println("Média da altura do grupo: "+mediaAltura+
                           "\nPessoas com mais de 90kg: " +pessoasComMais90Kg+
                           "\nPessoas que pesam menos de 50Kg  tem menos de 1.60m" +pessoasMenos50KgMenos160+
                           "\nPessoas que medem mais de 1.90m pesam mais de 100Kg" +pessoasMais100KgMais190);
    }
}
