package com.danillo.algoritmos.lista01;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número real: ");
        float x = entrada.nextFloat();
        float dobro = x * 2;
        float tercaParte = x / 3;
        System.out.println("O dobro de " +x+ " é: " +dobro+ "\nA terça parte de " +x+ " é: " +tercaParte);
    }
}
