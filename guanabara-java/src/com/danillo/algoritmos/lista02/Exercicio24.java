package com.danillo.algoritmos.lista02;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é a distância (em km) da viagem?");
        int distancia = entrada.nextInt();

        float passagem;
        if (distancia < 200){
            passagem = distancia * 0.50f;
        } else {
            passagem = distancia * 0.45f;
        }
        System.out.println("Valor da passagem: R$ " +passagem);
    }
}
