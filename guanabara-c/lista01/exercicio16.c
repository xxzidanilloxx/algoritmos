#include <stdio.h>

int main(){
    int cigarros_dia, anos_fumante, total_cigarros, minutos_perdidos, dias_perdidos;

    printf("Quantos cigarros você fuma por dia? ");
    scanf("%d", &cigarros_dia);
    printf("Há quantos anos você fuma? ");
    scanf("%d", &anos_fumante);

    total_cigarros = (cigarros_dia * 365) * anos_fumante;
    minutos_perdidos = 10 * total_cigarros;
    dias_perdidos = (minutos_perdidos/60)/24;
    printf("Dias de vida perdidos: %d", dias_perdidos);

    return 1;
}
