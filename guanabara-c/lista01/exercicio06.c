#include <stdio.h>

int main(){
    int x, antecessor, sucessor;

    printf("Insira um número: ");
    scanf("%d", &x);

    antecessor = x - 1;
    sucessor = x + 1;
    printf("Número: %d. Antecessor: %d. Sucessor: %d.", x, antecessor, sucessor);

    return 0;
}
