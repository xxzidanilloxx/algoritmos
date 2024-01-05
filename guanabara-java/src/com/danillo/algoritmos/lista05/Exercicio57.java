package com.danillo.algoritmos.lista05;

import java.util.Scanner;

public class Exercicio57 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float somaSalarioHomens = 0, somaSalarioMulheres = 0;
        char continuar = 'S';

        while(continuar == 'S'){
            System.out.println("Insira o salário do funcionário: ");
            float salario = entrada.nextFloat();
            System.out.println("Insira o gênero do funcionaŕio: ");
            char genero = entrada.next().charAt(0);

            if(genero == 'M'){
                somaSalarioHomens = somaSalarioHomens + salario;
            } else {
                somaSalarioMulheres = somaSalarioMulheres + salario;
            }

            System.out.println("Deseja continuar? (S ou N)");
            continuar = entrada.next().charAt(0);
        }

        System.out.println("Total de salários pagos aos homens: R$ " +somaSalarioHomens+
                           "\nTotal de salários pagos às mulheres: R$ " +somaSalarioMulheres);
    }
}
