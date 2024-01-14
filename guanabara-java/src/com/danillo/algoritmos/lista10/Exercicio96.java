package com.danillo.algoritmos.lista10;

import java.util.Scanner;

public class Exercicio96 {
    private static float media(float n1, float n2){
        return (n1 + n2)/2;
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        float n1 = entrada.nextFloat();

        System.out.println("Insira a segunda nota: ");
        float n2 = entrada.nextFloat();

        float media = media(n1, n2);
        System.out.println("Média: " +media);
    }
}
