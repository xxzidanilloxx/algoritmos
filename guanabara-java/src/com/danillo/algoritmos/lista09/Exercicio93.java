package com.danillo.algoritmos.lista09;

import java.util.Scanner;

public class Exercicio93 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Início: ");
        int x = entrada.nextInt();
        System.out.println("Fim: ");
        int y = entrada.nextInt();
        System.out.println("Incremento: ");
        int z = entrada.nextInt();

        contador(x, y, z);
    }

    public static void contador(int x, int y, int z){
        for (int i = x; i < y; i = i + z){
            System.out.println(i);
        }
    }
}
