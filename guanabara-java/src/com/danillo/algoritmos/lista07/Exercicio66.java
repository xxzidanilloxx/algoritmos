package com.danillo.algoritmos.lista07;

import java.util.Scanner;

public class Exercicio66 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int x = entrada.nextInt();

        for(int i = 0; i <= 10; i ++){
            int produto = x * i;
            System.out.println(x+ " x " +i+ " = " +produto);
        }
    }
}
