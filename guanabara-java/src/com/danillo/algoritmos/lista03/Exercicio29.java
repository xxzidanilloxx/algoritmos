package com.danillo.algoritmos.lista03;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o nome do funcionário: ");
        String nome = entrada.nextLine();
        System.out.println("Salário: ");
        float salario = entrada.nextFloat();
        System.out.println("Tempo de serviço na empresa: ");
        int tempoServicoEmpresa = entrada.nextInt();

        float aumento;
        float novoSalario;

        if(tempoServicoEmpresa < 3){
            aumento = salario * 3/100;
            novoSalario = salario + aumento;
        } else if(tempoServicoEmpresa <= 10){
            aumento = salario * 12.5f/100;
            novoSalario = salario + aumento;
        }else{
            aumento = salario * 20/100;
            novoSalario = salario + aumento;
        }
        System.out.println("Nome: " +nome+ "\nSalário reajustado: R$ " +novoSalario);
    }
}
