package com.danillo.algoritmos.lista03;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o tipo de carro a ser alugado: 1- Carro popular 2-Carro de luxo");
        int tipoCarro = entrada.nextInt();
        System.out.println("Insira a quantidade de dias que o carro foi alugado: ");
        int diasAluguel = entrada.nextInt();
        System.out.println("Insira a quantidade de km que foram percorridos: ");
        int kmPercorridos = entrada.nextInt();

        int valorTempoAluguel;
        float valorDistanciaPercorrida;

        if(tipoCarro == 1){
            valorTempoAluguel = diasAluguel * 90;

            if(kmPercorridos <= 100){
                valorDistanciaPercorrida = kmPercorridos * 0.20f;
            }else{
                valorDistanciaPercorrida = kmPercorridos * 0.10f;
            }
        }else{
            valorTempoAluguel = diasAluguel * 150;

            if(kmPercorridos <= 200){
                valorDistanciaPercorrida = kmPercorridos * 0.30f;
            }else{
                valorDistanciaPercorrida = kmPercorridos * 0.25f;
            }
        }

        float valorAluguel = valorTempoAluguel + valorDistanciaPercorrida;
        System.out.println("Valor do aluguel: R$ " +valorAluguel);
    }
}
