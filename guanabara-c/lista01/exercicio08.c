#include <stdio.h>

int main(){
    float m, km, hm, dam, dm, cm, mm;

    printf("Insira uma distância em metros: ");
    scanf("%f", &m);

    km = m / 1000;
    hm = m / 100;
    dam = m / 10;
    dm = m * 10;
    cm = m * 100;
    mm = m * 1000;
    printf("A distância de %.2f metros corresponde a:\n%.2fkm\n%.2fhm\n%.2fdam\n%.2fdm\n%.2fcm\n%.2fmm\n", m, km, hm, dam, dm, cm, mm);

    return 1;
}
