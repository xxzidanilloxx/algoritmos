import random

vetor = []

for i in range(30):
    i = random.randint(1, 15)
    vetor.append(i)

print(vetor)

x = int(input("Insira um número: "))
for i in range(30):
    if x == vetor[i]:
        print(f"Número: {vetor[i]} | Posição {i}")
