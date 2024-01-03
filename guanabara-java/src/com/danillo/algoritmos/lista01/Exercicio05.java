package com.danillo.algoritmos.lista01;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a nota 1: ");
        float n1 = entrada.nextFloat();
        System.out.println("Insira a nota 2: ");
        float n2 = entrada.nextFloat();

        float media = (n1 + n2)/2;
        System.out.println("A média entre " +n1+ " e " +n2+ " é igual a " +media);
    }
}
