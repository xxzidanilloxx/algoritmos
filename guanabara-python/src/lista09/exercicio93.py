inicio = int(input("Insira o número referente ao início: "))
fim = int(input("Insira o número referente ao fim: "))
incremento = int(input("Insira o número referente ao incremento da contagem: "))


def contador(x, y, z):
    for i in range(x, y, z):
        print(i)


contador(inicio, fim, incremento)
