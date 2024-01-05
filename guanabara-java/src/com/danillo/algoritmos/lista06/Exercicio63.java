package com.danillo.algoritmos.lista06;

import java.util.Scanner;

public class Exercicio63 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0, menor = Integer.MAX_VALUE, par = 0, contador = 0;
        char continuar;

        do{
            System.out.println("Insira um número: ");
            int x = entrada.nextInt();

            if(x < menor){
                menor = x;
            }

            if(x % 2 == 0){
                par++;
            }

            soma = soma + x;
            contador++;

            System.out.println("Deseja continuar? (S ou N)");
            continuar = entrada.next().charAt(0);
        }while(continuar == 'S');

        float media = (float) soma/contador;

        System.out.println("Soma: " +soma+ "\nMenor valor: " +menor+ "\nMédia: " +media+ "\nValores pares: " +par);
    }
}
