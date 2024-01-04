package com.danillo.algoritmos.lista04;

import java.util.Scanner;

public class Exercicio51 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o preço de um produto: ");
        float preco = entrada.nextFloat();

        int i = 0;
        float maiorPreco = preco, menorPreco = preco;

        while(i < 3){
            System.out.println("Insira o preço de um produto: ");
            preco = entrada.nextFloat();

            if (preco > maiorPreco){
                maiorPreco = preco;
            }
            if (preco < menorPreco){
                maiorPreco = preco;
            }

            i++;
        }
        System.out.println("Maior preço inserido: R$ " +maiorPreco+ "\nMenor preço inserido: R$ " +menorPreco);
    }
}
