package com.danillo.algoritmos.lista09;

import java.util.Scanner;

public class Exercicio94 {
    private static void fibonacci(int x){
        System.out.println("Fibonacci (" +x+ "): ");

        int primeiro = 0, proximo = 1;
        for(int i = 0; i < x; i++){
            int f = proximo + primeiro;
            System.out.print(f+ " >> ");
            primeiro = proximo;
            proximo = f;
        }
        System.out.println("Fim");
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int x = entrada.nextInt();

        fibonacci(x);
    }
}
