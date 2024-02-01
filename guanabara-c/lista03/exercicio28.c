#include <stdio.h>

int main(){

    float largura, comprimento, area;

    printf("Insira a largura do terreno: ");
    scanf("%f", &largura);
    printf("Insira o comprimento: ");
    scanf("%f", &comprimento);

    area = largura * comprimento;

    if (area < 100){
        printf("Área: %.2f m². TERRENO POPULAR.", area);
    }
    else if (area >= 100 && area < 500){
        printf("Área: %.2f m². TERRENO MASTER.", area);
    }
    else{
        printf("Área: %.2f m². TERRENO VIP.", area);
    }

    return 0;
}
