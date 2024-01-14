package com.danillo.algoritmos.lista10;

import java.util.Scanner;

public class Exercicio100 {
    private static float media(float n1, float n2){
        return (n1 + n2)/2;
    }

    private static String situacao(float media){
        if(media >= 7){
            return "APROVADO";
        }else if(media >= 5){
            return "RECUPERAÇÃO";
        }else{
            return "REPROVADO";
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        float n1 = entrada.nextFloat();

        System.out.println("Insira a segunda nota: ");
        float n2 = entrada.nextFloat();

        float media = media(n1, n2);
        System.out.println("Média: " + media);

        String situacao = situacao(media);
        System.out.println("Situação: " + situacao);
    }
}
