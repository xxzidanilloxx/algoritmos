package com.danillo.algoritmos.lista09;

import java.util.Scanner;

public class Exercicio92 {
    private static void parOuImpar(int x){
        if(x % 2 == 0){
            System.out.println("O número é par.");
        }else{
            System.out.println("O número é ímpar.");
        }
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int x = entrada.nextInt();

        parOuImpar(x);
    }
}
