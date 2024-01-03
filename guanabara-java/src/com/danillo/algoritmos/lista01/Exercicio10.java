package com.danillo.algoritmos.lista01;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a altura da parede: ");
        float altura = entrada.nextFloat();
        System.out.println("Insira a largura da parede: ");
        float largura = entrada.nextFloat();

        float area = altura * largura;
        System.out.println("Área a ser pintada: " +area);
        float tinta = area / 2;
        System.out.println("Latas de tinta: " +tinta);
    }
}
