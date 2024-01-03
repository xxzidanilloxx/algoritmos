package com.danillo.algoritmos.lista01;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o nome do funcionário?");
        String nome = entrada.nextLine();
        System.out.println("Qual é o salário do funcionário?");
        float salario = entrada.nextFloat();
        System.out.println("Nome: " +nome+ "\nSalário: R$ " +salario);
    }
}
