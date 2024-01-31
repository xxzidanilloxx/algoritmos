#include <stdio.h>

int main(){
    int a, b, soma;

    printf("Insira o primeiro número: ");
    scanf("%d", &a);
    printf("Insira o segundo número: ");
    scanf("%d", &b);

    soma = a + b;
    printf("A soma entre %d e %d é: %d", a, b, soma);

    return 0;
}
