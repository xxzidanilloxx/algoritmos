a = int(input("Digite um número inteiro: "))
b = int(input("Digite outro número inteiro: "))


def maior(a, b):
    if a > b:
        print("Maior valor: ", a)
    elif b > a:
        print("Maior valor: ", b)
    else:
        print("Os valores são iguais.")


maior(a, b)
