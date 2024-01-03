package com.danillo.algoritmos.lista02;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a velocidade do veículo: ");
        int velocidade = entrada.nextInt();

        if(velocidade > 80){
            int velocidadeExcedida = velocidade - 80;
            int multa = velocidadeExcedida * 5;
            System.out.println("Usuário multado! \nValor da multa: R$ " +multa);
        }
    }
}
