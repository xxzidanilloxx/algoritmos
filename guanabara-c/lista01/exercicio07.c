#include <stdio.h>

int main(){
    int x, dobro_x;
    float terca_parte_x;

    printf("Insira um número: ");
    scanf("%d", &x);

    dobro_x = x * 2;
    terca_parte_x = (float)x / 3;
    printf("O dobro de %d é: %d. A terça parte de %d é %.2f.", x, dobro_x, x, terca_parte_x);

    return 0;
}
