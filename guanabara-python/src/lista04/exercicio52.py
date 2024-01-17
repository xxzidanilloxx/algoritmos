i = 0
soma_idade = 0
maior_18 = 0
menor_5 = 0
maior_idade = 0

while i < 5:
    nome = input("Insira o nome: ")
    idade = int(input("Insira a idade: "))

    if idade > 18:
        maior_18 = maior_18 + 1

    if idade < 5:
        menor_5 = menor_5 + 1

    if idade > maior_idade:
        maior_idade = idade

    soma_idade = soma_idade + idade
    i = i + 1

media = soma_idade / i

print(f"Média: {media}.\nMaior de 18: {maior_18}.\nMenor de 5: {menor_5}.\nMaior idade: {maior_idade}.")
