package com.danillo.algoritmos.lista02;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um tamanho da reta a: ");
        int a = entrada.nextInt();
        System.out.println("Insira um tamanho da reta b: ");
        int b = entrada.nextInt();
        System.out.println("Insira um tamanho da reta c: ");
        int c = entrada.nextInt();

        if((a < b + c) && (b < a + c) && (c < a + b)){
            System.out.println("É possível formar um triângulo com as retas fornecidas.");
        } else {
            System.out.println("Não é possível formar um triângulo com as retas fornecidas.");
        }
    }
}
