import random

numero_magico = random.randint(1, 10)

i = 0
while i <= 4:
    x = int(input("Tente acertar o número mágico: "))

    if x == numero_magico:
        print(f"Acertou! O número mágico é {numero_magico}")
        break
    else:
        print("Errou!")

    i = i + 1
