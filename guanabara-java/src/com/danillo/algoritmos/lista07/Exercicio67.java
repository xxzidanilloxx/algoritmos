package com.danillo.algoritmos.lista07;

import java.util.Scanner;

public class Exercicio67 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int x = entrada.nextInt();

        for(int i = 0; i <= x; i++){
            System.out.println(i);
        }
        System.out.println("Fim");
    }
}
