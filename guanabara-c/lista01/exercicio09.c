#include <stdio.h>

int main(){
    float real, dolar;

    printf("Insira uma quantia em reais: ");
    scanf("%f", &real);

    dolar = real * 4.95;
    printf("R$ %.2f = US$ %.2f", real, dolar);

    return 1;
}
