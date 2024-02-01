#include <stdio.h>

int main(){

    int x, y;

    printf("Insira um número: ");
    scanf("%d", &x);
    printf("Insira outro número: ");
    scanf("%d", &y);

    if (x > y){
        printf("O número %d é maior que o número %d.", x, y);
    }
    else if (y > x){
        printf("O número %d é maior que o número %d.", y, x);
    }
    else{
        printf("Os números são iguais.");
    }

    return 0;
}
