#include <stdio.h>

int main(){
    char nome[30];
    float salario;

    printf("Insira o nome: ");
    scanf("%s", &nome);
    printf("Insira o salário: ");
    scanf("%f", &salario);
    printf("O funcionário %s tem um salário de R$ %.2f", nome, salario);

    return 0;
}
