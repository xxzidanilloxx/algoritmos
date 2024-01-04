package com.danillo.algoritmos.lista04;

import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i = 0;
        int par = 0;
        int impar = 0;

        while(i < 6){
            System.out.println("Insira um número inteiro: ");
            int x = entrada.nextInt();

            if(x % 2 == 0){
                par++;
            } else {
                impar++;
            }
            i++;
        }
        System.out.println("Números pares: " +par+ "\nNúmeros ímpares: " +impar);
    }
}
