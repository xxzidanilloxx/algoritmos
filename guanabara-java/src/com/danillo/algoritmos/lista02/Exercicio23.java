package com.danillo.algoritmos.lista02;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Insira o seu gênero (M ou F): ");
        char genero = entrada.next().charAt(0);
        System.out.println("Insira o valor da compra: ");
        float valor = entrada.nextFloat();

        if(genero == 'F'){
            float desconto = valor * 13/100;
            float novoValor = valor - desconto;
            System.out.println("Valor com desconto (-13%): R$ " +novoValor);
        } else {
            float desconto = valor * 5/100;
            float novoValor = valor - desconto;
            System.out.println("Valor com desconto (-5%): R$ " +novoValor);
        }
    }
}
