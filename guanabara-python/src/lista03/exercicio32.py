import random

numero_magico = random.randint(1, 5)
x = int(input("Descubra o número mágico (entre 1 e 5): "))

if x == numero_magico:
    print(f"Acertou! Número mágico: {numero_magico}")
else:
    print(f"Errou! Número mágico: {numero_magico}")
