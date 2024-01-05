package com.danillo.algoritmos.lista05;

import java.util.Scanner;

public class Exercicio56 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0;

        while(true){
            System.out.println("Insira um número: ");
            int x = entrada.nextInt();

            if (x == 1111){
                break;
            }

            soma = soma + x;
        }

        System.out.println("Soma: " +soma);
    }
}
