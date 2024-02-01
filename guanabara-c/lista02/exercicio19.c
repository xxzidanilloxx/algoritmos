#include <stdio.h>

int main(){

    float n1, n2, media;

    printf("Insira a primeira nota: ");
    scanf("%f", &n1);
    printf("Insira a segunda nota: ");
    scanf("%f", &n2);

    media = (n1 + n2)/2;

    if(media >= 7){
        printf("Média: %.2f. Aproveitamento: Bom.", media);
    }
    else{
        printf("Média: %.2f. Aproveitamento: Ruim.", media);
    }

    return 0;
}
