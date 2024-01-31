#include <stdio.h>

int main(){
    char nome[30];

    printf("Digite o seu nome: ");
    scanf("%s", &nome);
    printf("Olá, %s! Seja bem-vindo!", nome);

    return 0;
}
