j1 = int(input("Insira o número correspondente (Pedra = 1  Papel = 2  Tesoura = 3): "))
j2 = int(input("Insira o número correspondente (Pedra = 1  Papel = 2  Tesoura = 3): "))

if j1 == 1:
    if j2 == 1:
        print("Empate.")
    elif j2 == 2:
        print("Jogador 2 venceu! Papel ganha de pedra.")
    else:
        print("Jogador 1 venceu! Pedra ganha de tesoura.")
elif j1 == 2:
    if j2 == 1:
        print("Jogador 1 venceu! Papel ganha de pedra.")
    elif j2 == 2:
        print("Empate")
    else:
        print("Jogador 2 venceu! Tesoura ganha de papel.")
else:
    if j2 == 1:
        print("Jogador 2 venceu! Pedra ganha de tesoura.")
    elif j2 == 2:
        print("Jogador 1 venceu! Tesoura ganha de papel.")
    else:
        print("Empate")
