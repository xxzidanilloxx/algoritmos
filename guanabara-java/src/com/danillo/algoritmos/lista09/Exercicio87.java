package com.danillo.algoritmos.lista09;

public class Exercicio87 {
    private static void gerador(String mensagem){
        exibirLinha();
        System.out.println(mensagem);
        exibirLinha();
    }

    private static void exibirLinha() {
        System.out.println("********************");
    }

    public static void main(String[] args){
        gerador("Not all those who wander are lost.");
    }
}
