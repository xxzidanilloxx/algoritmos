package com.danillo.algoritmos.lista07;

import java.util.Scanner;

public class Exercicio68 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int mulheresCadastradas = 0, homensMais100Kg = 0;
        float soma = 0, maiorPesoHomens = 0;

        for(int i = 0; i < 8; i++){
            System.out.println("Insira o gênero: ");
            char genero = entrada.next().charAt(0);
            System.out.println("Insira o peso: ");
            float peso = entrada.nextFloat();

            if(genero == 'F'){
                soma = soma + peso;
                mulheresCadastradas++;
            }

            if(genero == 'M' && peso > 100){
                homensMais100Kg++;
            }

            if(genero == 'M' && peso > maiorPesoHomens){
                maiorPesoHomens = peso;
            }
        }

        float mediaPesoMulheres = soma/mulheresCadastradas;

        System.out.println("Mulheres foram cadastradas: " +mulheresCadastradas+
                           "\nHomens com mais de 100kg: " +homensMais100Kg+
                           "\nMédia do peso entre as mulheres: " +mediaPesoMulheres+
                           "\nMaior peso entre os homens: " +maiorPesoHomens);
    }
}
