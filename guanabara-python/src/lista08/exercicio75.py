vetor = [] * 15
anterior = 0
proximo = 1

vetor.append(proximo)

for i in range(14):
    fibonacci = anterior + proximo
    vetor.append(fibonacci)
    anterior = proximo
    proximo = fibonacci

print(vetor)
