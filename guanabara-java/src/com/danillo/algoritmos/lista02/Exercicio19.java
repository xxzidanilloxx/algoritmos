package com.danillo.algoritmos.lista02;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a nota 1: ");
        float n1 = entrada.nextFloat();
        System.out.println("Insira a nota 2: ");
        float n2 = entrada.nextFloat();

        float media = (n1 + n2)/2;
        if(media >= 7){
            System.out.println("Média: " +media+ "\nO aluno teve um bom aproveitamento.");
        } else {
            System.out.println("Média: " +media+ "\nO aluno não teve um bom aproveitamento.");
        }
    }
}
