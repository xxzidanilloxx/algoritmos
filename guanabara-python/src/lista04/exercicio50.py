import random

i = 0
maior_5 = 0
divisivel_3 = 0

while i < 20:
    x = random.randint(1, 20)
    print(x)

    if x > 5:
        maior_5 = maior_5 + 1

    if x % 3 == 0:
        divisivel_3 = divisivel_3 + 1

    i = i + 1

print(f"Quantidade de números sorteados: {i}\nNúmeros acima de 5: {maior_5}\nNúmeros divisíveis por 3: {divisivel_3}")
