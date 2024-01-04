package com.danillo.algoritmos.lista04;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor inicial da contagem: ");
        int x = entrada.nextInt();
        System.out.println("Digite o valor final da contagem: ");
        int y = entrada.nextInt();
        System.out.println("Digite o incremento da contagem: ");
        int z = entrada.nextInt();

        while(x <= y){
            System.out.println(x);
            x = x + z;
        }
    }
}
