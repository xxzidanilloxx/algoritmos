def exibir_linha(y):
    if y == 1:
        print("********************")
    elif y == 2:
        print("--------------------")
    else:
        print(";;;;;;;;;;;;;;;;;;;;")


def gerador(frase, x, y):
    exibir_linha(y)

    for i in range(x):
        print(frase)

    exibir_linha(y)


gerador("You shall not pass!", 3, 3)
