package com.danillo.algoritmos.lista02;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o ano em que você nasceu: ");
        int anoNascimento = entrada.nextInt();

        int anoAtual = 2024;
        int idade = anoAtual - anoNascimento;
        if (idade >= 16){
            System.out.println("Você tem " +idade+ " anos e pode votar.");
        } else {
            System.out.println("Você tem " +idade+ " anos e ainda não pode votar.");
        }
    }
}
