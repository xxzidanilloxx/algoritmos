def exibir_linha():
    print("********************")


def gerador(frase, x):
    exibir_linha()

    for i in range(x):
        print(frase)

    exibir_linha()


gerador("You shall not pass!", 3)
