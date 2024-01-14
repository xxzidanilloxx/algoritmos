package com.danillo.algoritmos.lista09;

import java.util.Scanner;

public class Exercicio91 {
    private static void maior(int a, int b) {
        if (a > b){
            System.out.println("Maior valor: " +a);
        } else if (b > a){
            System.out.println("Maior valor: " +b);
        } else{
            System.out.println("Os valores são iguais.");
        }
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int a = entrada.nextInt();

        System.out.println("Insira outro número: ");
        int b = entrada.nextInt();

        maior(a, b);
    }
}
