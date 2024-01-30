x = int(input("Digite um número inteiro: "))


def par_ou_impar(y):
    if y % 2 == 0:
        print(f"O número {y} é par.")
    else:
        print(f"O número {y} é ímpar.")


par_ou_impar(x)
