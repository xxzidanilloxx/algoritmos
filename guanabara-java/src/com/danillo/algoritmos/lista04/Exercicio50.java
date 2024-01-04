package com.danillo.algoritmos.lista04;

import java.util.Random;

public class Exercicio50 {
    public static void main(String[] args) {
        int i = 0;
        int acimaDeCinco = 0;
        int divisivelPorTres = 0;

        while(i < 5){
            Random random = new Random();

            int aleatorio = random.nextInt(10);
            System.out.println(aleatorio);

            if(aleatorio > 5){
                acimaDeCinco++;
            }

            if(aleatorio % 3 == 0){
                divisivelPorTres++;
            }

            i++;
        }
        System.out.println("Números maiores que 5: " +acimaDeCinco+ "\nNúmeros divisíveis por 3: " +divisivelPorTres);
    }
}
