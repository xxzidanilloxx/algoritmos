package com.danillo.algoritmos.lista07;

import java.util.Scanner;

public class Exercicio69 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o primeiro termo: ");
        int termo = entrada.nextInt();
        System.out.println("Insira a razão: ");
        int razao = entrada.nextInt();

        for(int i = 0; i < 10; i++){
            int pa = termo;
            System.out.println(pa);
            termo = pa + razao;
        }
    }
}
