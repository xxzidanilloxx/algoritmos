#include <stdio.h>

int main(){
    int x;

    printf("Insira um número inteiro: ");
    scanf("%d", &x);

    if(x % 2 == 0){
        printf("O número %d é par.", x);
    }
    else{
        printf("O número %d é ímpar.", x);
    }

    return 0;
}
