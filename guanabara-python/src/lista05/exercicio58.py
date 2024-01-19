i = 0
soma_idade = 0

while True:
    idade = int(input("Insira a idade: "))

    if idade == 999:
        break

    soma_idade = soma_idade + idade

print(soma_idade)
