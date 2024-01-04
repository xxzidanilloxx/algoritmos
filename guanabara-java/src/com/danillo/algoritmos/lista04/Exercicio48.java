package com.danillo.algoritmos.lista04;

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i = 0;
        int soma = 0;

        while(i < 7){
            System.out.println("Insira um número inteiro: ");
            int x = entrada.nextInt();
            soma = soma + x;
            i++;
        }

        System.out.println("Soma: " +soma);
    }
}
