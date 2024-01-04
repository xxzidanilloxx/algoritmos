package com.danillo.algoritmos.lista04;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int x = entrada.nextInt();

        int i = 0;

        while(i <= x){
            System.out.println(i);
            i++;
        }
        System.out.println("Acabou!");
    }
}
