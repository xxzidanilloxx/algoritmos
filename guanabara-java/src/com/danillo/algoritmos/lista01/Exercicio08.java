package com.danillo.algoritmos.lista01;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma distância em metros: ");
        float m = entrada.nextFloat();

        float km = m / 1000;
        float hm = m / 100;
        float dam = m/ 10;
        float dm = m * 10;
        float cm = m * 100;
        float mm = m * 1000;

        System.out.println("A distância de " +m+ "m corresponde a: \n"
                            +km+ "km\n" +hm+ "hm\n" +dam+ "dam\n" +dm+ "dm\n" +cm+ "cm\n" +mm+ "mm\n");
    }
}
