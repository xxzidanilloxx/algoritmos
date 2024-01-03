package com.danillo.algoritmos.lista03;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um tamanho da reta a: ");
        int a = entrada.nextInt();
        System.out.println("Insira um tamanho da reta b: ");
        int b = entrada.nextInt();
        System.out.println("Insira um tamanho da reta c: ");
        int c = entrada.nextInt();

        if((a < b + c) && (b < a + c) && (c < a + b)){
            if(a == b && b == c){
                System.out.println("Triângulo equilátero");
            } else if(a == b || b == c || a ==c) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Não é possível formar um triângulo com as retas fornecidas.");
        }
    }
}
