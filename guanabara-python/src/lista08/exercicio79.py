vetor = []

for i in range(10):
    x = int(input("Insira um número: "))
    vetor.append(x)

for i in range(10):
    if vetor[i] % 2 == 0:
        print(f"Número: {vetor[i]} Posição {i}")
