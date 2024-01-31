#include <stdio.h>

int main(){
    int a, b, c, delta;

    printf("Insira o valor de a: ");
    scanf("%d", &a);
    printf("Insira o valor de b: ");
    scanf("%d", &b);
    printf("Insira o valor de c: ");
    scanf("%d", &c);
    delta = (b * b) - 4 * a * c;
    printf("O valor de delta é: %d", delta);

    return 1;
}
