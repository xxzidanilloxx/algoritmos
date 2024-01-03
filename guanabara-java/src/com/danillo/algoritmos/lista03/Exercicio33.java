package com.danillo.algoritmos.lista03;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o valor da casa: ");
        float valorCasa = entrada.nextFloat();
        System.out.println("Insira o seu salário: ");
        float salario = entrada.nextFloat();
        System.out.println("Em quantos anos planeja pagar? ");
        int tempoPagamento = entrada.nextInt();

        int quantidadeParcelas = tempoPagamento * 12;
        float prestacaoMensal = valorCasa/quantidadeParcelas;
        float porcentagemSalario = salario * 30/100;

        if(prestacaoMensal > porcentagemSalario){
            System.out.println("Empréstimo reprovado");
        }else{
            System.out.println("Empréstimo aprovado");
        }
    }
}
