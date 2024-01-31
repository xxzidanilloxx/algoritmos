#include <stdio.h>

int main(){
    float altura, largura, area, tinta;

    printf("Insira a altura da parede: ");
    scanf("%f", &altura);
    printf("Insira a largura da parede");
    scanf("%f", &largura);

    area = altura * largura;
    tinta = area / 2;
    printf("Área a ser pintada: %.2f m².\nLitros de tinta necessários: %.2f litros", area, tinta);

    return 1;
}
