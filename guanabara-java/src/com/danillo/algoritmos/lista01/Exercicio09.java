package com.danillo.algoritmos.lista01;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quanto dinheiro você tem? (em R$)");
        float real = entrada.nextFloat();

        float dolar = real / 4.92f;
        System.out.println("Você pode comprar US$ " + dolar);
    }
}
