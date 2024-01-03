package com.danillo.algoritmos.lista03;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int n1 = entrada.nextInt();
        System.out.println("Insira outro número inteiro: ");
        int n2 = entrada.nextInt();

        if(n1 > n2){
            System.out.println("O primeiro número é maior.");
        } else if (n1 < n2){
            System.out.println("O segundo número é maior.");
        } else {
            System.out.println("Não existe valor maior, os dois são iguais.");
        }
    }
}
