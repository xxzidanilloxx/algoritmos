def potencia(base, expoente):
    resultado = 1

    for i in range(1, expoente + 1):
        resultado = resultado * base
    return resultado


base = int(input("Insira a base: "))
expoente = int(input("Insira o expoente: "))
resultado = potencia(base, expoente)
print(resultado)
