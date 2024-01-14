package com.danillo.algoritmos.lista10;

import java.util.Scanner;

public class Exercicio95 {
    private static int somador(int a, int b) {
        return a + b;
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int a = entrada.nextInt();

        System.out.println("Insira outro número: ");
        int b = entrada.nextInt();

        int resultado =  somador(a, b);
        System.out.println("Resultado: " +resultado);
    }
}
