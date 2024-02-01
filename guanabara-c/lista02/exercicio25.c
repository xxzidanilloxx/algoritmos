#include <stdio.h>

int main(){

    int a, b, c;

    printf("Insira uma medida: ");
    scanf("%d", &a);
    printf("Insira outra medida: ");
    scanf("%d", &b);
    printf("Insira outra medida: ");
    scanf("%d", &c);

    if (a < b + c && b < a + c && c < a + b){
        printf("É possível formar um triângulo com as medidas informadas.");
    }
    else{
        printf("Não é possível formar um triângulo com as medidas informadas.");
    }

    return 0;
}
