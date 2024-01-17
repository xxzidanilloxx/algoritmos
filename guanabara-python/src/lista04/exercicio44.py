valor_inicial = int(input("Insira o valor inicial: "))
valor_final = int(input("Insira o valor inicial: "))
incremento = int(input("Insira o incremento: "))

while valor_inicial < valor_final + 1:
    print(valor_inicial)
    valor_inicial = valor_inicial + incremento

print("Fim.")
