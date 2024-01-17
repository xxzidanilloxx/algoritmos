n1 = float(input("Insira a primeira nota: "))
n2 = float(input("Insira a segunda nota: "))
media = (n1 + n2)/2

if media < 5:
    print(f"Média: {media}. Situação: REPROVADO.")
elif media >= 5 and media < 7:
    print(f"Média: {media}. Situação: RECUPERAÇÃO.")
else:
    print(f"Média: {media}. Situação: APROVADO.")
