#include <stdio.h>

int main(){
    int quantidade_dias_trabalhados, salario_dia, salario;

    printf("Insira a quantidade de dias trabalhados: ");
    scanf("%d", &quantidade_dias_trabalhados);

    salario_dia = 8 * 25;
    salario = quantidade_dias_trabalhados * salario_dia;
    printf("Salário: R$ %d", salario);

    return 1;
}
