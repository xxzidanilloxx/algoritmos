package com.danillo.algoritmos.lista09;

public class Exercicio88 {
    private static void gerador(String mensagem, int x){
        exibirLinha();
        for(int i = 0; i < x; i++){
            System.out.println(mensagem);
        }
        exibirLinha();
    }

    private static void exibirLinha(){
        System.out.println("********************");
    }

    public static void main(String[] args){
        gerador("Teste", 5);
    }
}
