package com.danillo.algoritmos.lista03;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("1-Pedra 2-Papel 3-Tesoura");
        System.out.println("Jogador 1: ");
        int j1 = entrada.nextInt();
        System.out.println("Jogador 2: ");
        int j2 = entrada.nextInt();

        if(j1 == 1){
            if(j2 == 1){
                System.out.println("Empate");
            }else if(j2 == 2){
                System.out.println("Jogador 2 venceu! Papel ganha de pedra");
            }else{
                System.out.println("Jogador 1 venceu! Pedra ganha de tesoura");
            }
        } else if (j1 == 2){
            if(j2 == 1){
                System.out.println("Jogador 1 venceu! Papel ganha de pedra");
            }else if(j2 == 2){
                System.out.println("Empate");
            }else{
                System.out.println("Jogador 2 venceu! Tesoura ganha de papel");
            }
        } else {
            if(j2 == 1){
                System.out.println("Jogador 2 venceu! Pedra ganha de tesoura");
            }else if(j2 == 2){
                System.out.println("Jogador 1 venceu! Tesoura ganha de papel");
            }else{
                System.out.println("Empate");
            }
        }
    }
}
