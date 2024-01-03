package com.danillo.algoritmos.lista01;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nome = entrada.nextLine();
        System.out.println("Olá, " +nome+ ", é um prazer te conhecer!");
    }
}
