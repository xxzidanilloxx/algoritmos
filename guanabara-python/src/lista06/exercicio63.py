i = 0
soma = 0
menor_numero = float('inf')
divisivel_por_2 = 0

while True:
    numero = int(input("Insira um número: "))

    soma = soma + numero

    if numero < menor_numero:
        menor_numero = numero

    if numero % 2 == 0:
        divisivel_por_2 = divisivel_por_2 + 1

    i = i + 1

    continuar = int(input("Deseja continuar: 1 - Sim | 2 - Não "))
    if continuar == 2:
        break

media = soma / i

print(f"Soma: {soma}.\nMenor número digitado: {menor_numero}.\nMédia: {media}.\nNúmeros pares: {divisivel_por_2}.")
