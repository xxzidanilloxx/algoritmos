#include <stdio.h>

int main(){

    int km_percorridos;
    float preco_passagem;

    printf("Insira a distância da viagem em km: ");
    scanf("%d", &km_percorridos);
    
    if(km_percorridos <= 200){
        preco_passagem = km_percorridos * 0.50;
    }
    else{
        preco_passagem = km_percorridos * 0.45;
    }

    printf("Preço da passagem: R$ %.2f", preco_passagem);

    return 0;
}
