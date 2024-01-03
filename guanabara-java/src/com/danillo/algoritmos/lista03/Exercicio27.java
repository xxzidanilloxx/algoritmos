package com.danillo.algoritmos.lista03;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        float n1 = entrada.nextFloat();
        System.out.println("Insira a segunda nota: ");
        float n2 = entrada.nextFloat();

        float media = (n1 + n2)/2;

        if (media >= 7){
            System.out.println("Média: " +media+ "\nAprovado.");
        } else if (media >= 5 && media <= 6.9){
            System.out.println("Média: " +media+ "\nRecuperação.");
        } else {
            System.out.println("Média: " +media+ "\nReprovado.");
        }
    }
}
