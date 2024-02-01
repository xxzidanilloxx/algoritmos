#include <stdio.h>

int main(){
    int ano_atual, ano_nascimento, idade;

    printf("Digite o ano atual: ");
    scanf("%d", &ano_atual);
    printf("Digite o ano de nascimento: ");
    scanf("%d", &ano_nascimento);

    idade = ano_atual - ano_nascimento;
    if(idade >= 16){
        printf("Idade: %d anos. Você pode votar.", idade);
    }
    else{
        printf("Idade: %d anos. Você não pode votar.", idade);
    }

    return 0;
}
