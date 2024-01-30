vetor = []

for i in range(15):
    x = int(input("Insira um número: "))
    vetor.append(x)

for i in range(15):
    if vetor[i] % 10 == 0:
        print(f"Número: {vetor[i]} Posição {i}")
