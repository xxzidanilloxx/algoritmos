package com.danillo.algoritmos.lista01;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o preço do produto (em reais):");
        float preco = entrada.nextFloat();

        float desconto = preco * 5/100;
        float novoPreco = preco - desconto;
        System.out.println("Preço promocional (-5%): R$ " +novoPreco);
    }
}
