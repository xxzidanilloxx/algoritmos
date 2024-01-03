package com.danillo.algoritmos.lista02;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o ano em que você nasceu: ");
        int anoNascimento = entrada.nextInt();

        int anoAtual = 2024;
        int idade = anoAtual - anoNascimento;
        if(idade > 18){
            int tempo = idade - 18;
            System.out.println("Passaram-se " +tempo+ " anos do seu alistamento militar.");
        } else{
            int tempo = 18 - idade;
            System.out.println("Faltam " +tempo+ " anos para o seu alistamento militar.");
        }
    }
}
