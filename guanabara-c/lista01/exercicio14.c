#include <stdio.h>

int main(){
    int km_percorridos, quantidade_dias;
    float preco_km, preco_dia, preco_total;

    printf("Insira a quantidade de km percorridos: ");
    scanf("%d", &km_percorridos);
    printf("Insira a quantidade de dias em que o carro foi alugado: ");
    scanf("%d", &quantidade_dias);

    preco_km = km_percorridos * 0.20;
    preco_dia = quantidade_dias * 90;
    preco_total = preco_km + preco_dia;

    printf("Preço total: %.2f", preco_total);

    return 1;
}
