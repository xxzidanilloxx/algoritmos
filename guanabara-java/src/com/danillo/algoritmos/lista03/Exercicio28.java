package com.danillo.algoritmos.lista03;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a largura do terreno: ");
        float largura = entrada.nextFloat();
        System.out.println("Insira o comprimento do terreno: ");
        float comprimento = entrada.nextFloat();

        float area = largura * comprimento;

        if(area < 100){
            System.out.println("Terreno POPULAR");
        }else if(area <= 500){
            System.out.println("Terreno MASTER");
        }else{
            System.out.println("Terreno VIP");
        }
    }
}
