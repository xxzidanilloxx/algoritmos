#include <stdio.h>

int main(){

    int velocidade, velocidade_excedente, multa;

    printf("Insira a velocidade do veículo: ");
    scanf("%d", &velocidade);

    if(velocidade > 80){
        
        velocidade_excedente = velocidade - 80;
        multa = velocidade_excedente * 5;
        printf("O valor da multa é de R$ %d", multa);
    }

    return 0;
}
