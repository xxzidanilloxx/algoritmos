vetor = []
anterior = 0
proximo = 1
x = int(input("Insira a quantidade de termos fibonacci que você deseja: "))

vetor.append(anterior)
vetor.append(proximo)

for i in range(x - 2):
    fibonacci = anterior + proximo
    vetor.append(fibonacci)
    anterior = proximo
    proximo = fibonacci

print(vetor)
