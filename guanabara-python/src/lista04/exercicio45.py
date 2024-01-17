valor_inicial = int(input("Insira o valor inicial: "))
valor_final = int(input("Insira o valor inicial: "))
incremento = int(input("Insira o incremento: "))

if valor_inicial < valor_final:
    while valor_inicial <= valor_final:
        print(valor_inicial)
        valor_inicial = valor_inicial + incremento

    print("Fim.")

else:
    print("O valor inicial não pode ser maior do que o valor final.")
