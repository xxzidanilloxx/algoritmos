package com.danillo.algoritmos.lista10;

import java.util.Scanner;

public class Exercicio98 {
    public static int superSomador(int a, int b){
        int soma = 0;
        for (int i = a; i < b; i++){
            soma = soma + i;
        }
        return soma;
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int a = entrada.nextInt();

        System.out.println("Insira outro número: ");
        int b = entrada.nextInt();

        int resultado = superSomador(a, b);
        System.out.println("Resultado: " +resultado);
    }
}
