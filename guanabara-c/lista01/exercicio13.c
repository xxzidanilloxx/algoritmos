#include <stdio.h>

int main(){
    float salario_atual, novo_salario, aumento;

    printf("Insira o salário do funcionário: ");
    scanf("%f", &salario_atual);

    aumento = salario_atual * 15 / 100;
    novo_salario = salario_atual + aumento;
    printf("Salário reajustado: R$ %.2f", novo_salario);

    return 1;
}
