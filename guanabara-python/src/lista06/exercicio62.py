i = 0
soma_idade = 0
pessoas_mais_21 = 0

while True:
    idade = int(input("Insira a idade: "))

    soma_idade = soma_idade + idade

    if idade >= 21:
        pessoas_mais_21 = pessoas_mais_21 + 1

    i = i + 1

    continuar = int(input("Deseja continuar: 1 - Sim | 2 - Não "))
    if continuar == 2:
        break

media_idade = soma_idade / i

print(f"Idades digitadas: {i}.\nMédias das idades: {media_idade}.\nPessoas com 21 anos ou mais: {pessoas_mais_21}.")
