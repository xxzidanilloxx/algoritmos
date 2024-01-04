package com.danillo.algoritmos.lista04;

public class Exercicio43 {
    public static void main(String[] args) {
        int i = 30;

        while(i > 0){
            if(i % 4 == 0){
                System.out.println("[" +i+ "]");
            } else {
                System.out.println(i);
            }
            i--;
        }
    }
}
