#include <stdio.h>

int main(){
    float preco_atual, novo_preco, desconto;

    printf("Insira o preço do produto: ");
    scanf("%f", &preco_atual);

    desconto = preco_atual * 5 / 100;
    novo_preco = preco_atual - desconto;
    printf("Preço promocional: R$ %.2f", novo_preco);

    return 1;
}
