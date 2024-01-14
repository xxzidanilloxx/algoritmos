package com.danillo.algoritmos.lista09;

public class Exercicio89 {
    public static void gerador(String mensagem, int x, int y){
        exibirLinha(y);
        for(int i = 0; i < x; i++){
            System.out.println(mensagem);
        }
        exibirLinha(y);
    }

    public static void exibirLinha(int y){
        if(y == 1){
            System.out.println("********************");
        }else if(y == 2){
            System.out.println("--------------------");
        }else{
            System.out.println("::::::::::::::::::::");
        }
    }

    public static void main(String[] args){
        gerador("Teste", 5, 3);
    }
}
