#include <stdio.h>

int main(){

    char nome;
    int genero;
    float preco_compras, desconto, novo_preco;

    printf("Insira o nome: ");
    scanf("%s", &nome);
    printf("Insira o gênero: 1 - Masculino | 2 - Feminino ");
    scanf("%d", &genero);
    printf("Insira o preço das compras: ");
    scanf("%f", &preco_compras);

    if (genero == 1){
        desconto = preco_compras * 5 / 100;
    }
    else{
        desconto = preco_compras * 13 / 100;
    }
    
    novo_preco = preco_compras - desconto;
    printf("Preço com desconto: R$ %.2f", novo_preco);

    return 0;
}
