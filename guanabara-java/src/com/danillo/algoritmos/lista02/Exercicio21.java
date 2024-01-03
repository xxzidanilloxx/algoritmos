    package com.danillo.algoritmos.lista02;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um ano: ");
        int ano = entrada.nextInt();

        if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
            System.out.println("O ano " +ano+ " é bissexto.");
        } else {
            System.out.println("O ano " +ano+ " não é bissexto.");
        }
    }
}
