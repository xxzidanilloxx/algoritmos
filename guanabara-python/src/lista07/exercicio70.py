anterior = 0
proximo = 1

print(proximo)

for i in range(0,10):
    fibonacci = anterior + proximo
    print(fibonacci)

    anterior = proximo
    proximo = fibonacci
