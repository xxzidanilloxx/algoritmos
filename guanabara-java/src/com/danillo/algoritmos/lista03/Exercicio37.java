package com.danillo.algoritmos.lista03;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o salário atual: ");
        float salario = entrada.nextFloat();
        System.out.println("Insira o gênero (M ou F): ");
        char genero = entrada.next().charAt(0);
        System.out.println("Insira o tempo de serviço na empresa");
        int tempoServicoEmpresa = entrada.nextInt();

        float novoSalario;

        if(genero == 'F'){
            if(tempoServicoEmpresa < 15){
                novoSalario = salario + (salario * 5/100);
            } else if (tempoServicoEmpresa <=20) {
                novoSalario = salario + (salario * 12/100);
            } else{
                novoSalario = salario + (salario * 23/100);
            }
        }else{
            if(tempoServicoEmpresa < 20){
                novoSalario = salario + (salario * 3/100);
            } else if (tempoServicoEmpresa <=30) {
                novoSalario = salario + (salario * 13/100);
            } else{
                novoSalario = salario + (salario * 25/100);
            }
        }

        System.out.println("Salário reajustado: R$ " +novoSalario);
    }
}
