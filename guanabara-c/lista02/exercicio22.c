#include <stdio.h>

int main(){

    int ano_atual, ano_nascimento, idade, tempo_alistamento;

    printf("Digite o ano atual: ");
    scanf("%d", &ano_atual);
    printf("Digite o ano de nascimento: ");
    scanf("%d", &ano_nascimento);

    idade = ano_atual - ano_nascimento;

    if(idade > 18){
        tempo_alistamento = idade - 18;
        printf("Passaram-se %d anos do seu alistamento militar.", tempo_alistamento);
    }
    else{
        tempo_alistamento = 18 - idade;
        printf("Falta(m) %d ano(s) para o seu alistamento militar.", tempo_alistamento);
    }

    return 0;
}
