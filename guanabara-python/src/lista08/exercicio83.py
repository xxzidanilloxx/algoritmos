import random

vetor = []

for i in range(20):
    i = random.randint(0, 99)
    vetor.append(i)

print("Vetor desordenado: ", vetor)

for i in range(19):
    for j in range(19):
        if vetor[j] > vetor[j + 1]:
            aux = vetor[j]
            vetor[j] = vetor[j + 1]
            vetor[j + 1] = aux

print("Vetor ordenado: ", vetor)
