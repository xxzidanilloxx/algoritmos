package com.danillo.algoritmos.lista01;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a quantidade de km a serem percorridos: ");
        int km = entrada.nextInt();
        System.out.println("Insira a quantidade de dias que o veículo será alugado: ");
        int dias = entrada.nextInt();

        float valorTotal = (km * 0.20f) + (dias * 90);
        System.out.println("Valor total: R$ " +valorTotal);
    }
}
