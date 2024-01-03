package com.danillo.algoritmos.lista01;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos cigarros você fuma por dia?");
        int cigarrosPorDia = entrada.nextInt();
        System.out.println("Há quantos anos você fuma?");
        int anosComoFumante = entrada.nextInt();

        int minutosPerdidosPorDia = cigarrosPorDia * 10;
        int minutosPerdidosPorAno = minutosPerdidosPorDia * 365;
        int minutosPerdidos = minutosPerdidosPorAno * anosComoFumante;
        int diasPerdidos = (minutosPerdidos/60)/24;
        System.out.println("Dias de vida perdidos: " +diasPerdidos);
    }
}
