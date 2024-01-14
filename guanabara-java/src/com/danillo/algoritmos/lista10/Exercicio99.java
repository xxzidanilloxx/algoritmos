package com.danillo.algoritmos.lista10;

import java.util.Scanner;

public class Exercicio99 {
    private static int potencia(int base, int expoente){
        int resultado = 1;
        for(int i = 1; i <= expoente; i++){
            resultado = resultado * base;
        }
        return resultado;
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número (base): ");
        int base = entrada.nextInt();

        System.out.println("Insira um número (expoente): ");
        int expoente = entrada.nextInt();

        int resultado = potencia(base, expoente);
        System.out.println("Resultado: " +resultado);
    }
}
