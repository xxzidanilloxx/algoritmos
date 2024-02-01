#include <stdio.h>

int main(){

    float n1, n2, media;

    printf("Insira a primeira nota: ");
    scanf("%f", &n1);
    printf("Insira a segunda: ");
    scanf("%f", &n2);

    media = (n1 + n2)/2;

    if (media < 5){
        printf("Média: %.2f. Situação: REPROVADO.", media);
    }
    else if (media >= 5 && media < 7){
        printf("Média: %.2f. Situação: RECUPERAÇÃO.", media);
    }
    else{
        printf("Média: %.2f. Situação: APROVADO.", media);
    }

    return 0;
}
