package com.danillo.algoritmos.lista03;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a quantidade de horas de atividade física no mês: ");
        int horasAtividadeFisica = entrada.nextInt();

        int pontos;
        if (horasAtividadeFisica < 10){
            pontos = horasAtividadeFisica * 2;
        } else if (horasAtividadeFisica <= 20) {
            pontos = horasAtividadeFisica * 5;
        }else{
            pontos = horasAtividadeFisica * 10;
        }

        float valor = pontos * 0.05f;
        System.out.println("Valor: R$ " +valor);
    }
}
