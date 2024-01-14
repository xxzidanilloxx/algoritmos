package com.danillo.algoritmos.lista09;

import java.util.Scanner;

public class Exercicio90 {
    private static void somador(int a, int b) {
        int soma = a + b;
        System.out.println("Resultado: " +soma);
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int a = entrada.nextInt();

        System.out.println("Insira outro número: ");
        int b = entrada.nextInt();

        somador(a, b);
    }
}
