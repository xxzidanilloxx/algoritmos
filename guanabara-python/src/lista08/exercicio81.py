vetor = []
soma_idade = 0
quantidade_pessoas = 0
maior_idade = 0

for i in range(5):
    idade = int(input("Insira a idade: "))
    vetor.append(idade)

    quantidade_pessoas = quantidade_pessoas + 1
    soma_idade = soma_idade + idade

    if idade > maior_idade:
        maior_idade = idade

media_idade = soma_idade / quantidade_pessoas
print(f"Média: {media_idade}.")

print("Maior de 25 anos:")
for i in range(5):
    if vetor[i] > 25:
        print(f"Idade: {vetor[i]} | Posição {i}")

print(f"Maior idade: {maior_idade}")

for i in range(5):
    if vetor[i] == maior_idade:
        print(f"Idade: {vetor[i]} | Posição {i}")
