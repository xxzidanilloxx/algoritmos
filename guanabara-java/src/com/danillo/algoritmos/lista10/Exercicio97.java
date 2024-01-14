package com.danillo.algoritmos.lista10;

import java.util.Scanner;

public class Exercicio97 {
    private static String maior(int a, int b, int c){
        if(a > b && a > c){
            return "O primeiro número é maior.";
        }else if(b > a && b > c){
            return "O segundo número é maior.";
        }else if(c > a && c > b){
            return "O terceiro número é maior.";
        }else{
            if(a == b && a > c){
                return "O primeiro e o segundo número são iguais e maiores que o terceiro.";
            }else if(a == c && a > b){
                return "O primeiro e o terceiro número são iguais e maiores que o segundo.";
            }else if(b == c && b > a){
                return "O segundo e o terceiro número são iguais e maiores que o primeiro.";
            }else{
                return "Os números são iguais.";
            }
        }
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int a = entrada.nextInt();
        System.out.println("Insira o segundo número: ");
        int b = entrada.nextInt();
        System.out.println("Insira o terceiro número: ");
        int c = entrada.nextInt();

        String x = maior(a, b, c);
        System.out.println(x);
    }
}
