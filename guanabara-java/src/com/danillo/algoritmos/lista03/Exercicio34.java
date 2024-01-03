package com.danillo.algoritmos.lista03;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o seu peso: ");
        float peso = entrada.nextFloat();
        System.out.println("Insira a sua altura: ");
        float altura = entrada.nextFloat();

        float imc = peso / (altura * altura);
        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso ideal");
        }else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        }else if (imc >= 30 && imc < 40) {
            System.out.println("Obesidade");
        }else{
            System.out.println("Obesidade mórbida");
        }
    }
}
