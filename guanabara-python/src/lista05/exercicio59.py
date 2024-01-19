continuar = 1
maior_idade = 0
homens_cadastrados = 0
soma_idade_homens = 0
idade_mulher_mais_jovem = float('inf')

while continuar == 1:
    idade = int(input("Insira a idade: "))
    genero = int(input("Insira o gênero: 1- Masculino 2 - Feminino "))

    if idade > maior_idade:
        maior_idade = idade

    if genero == 1:
        homens_cadastrados = homens_cadastrados + 1
        soma_idade_homens = soma_idade_homens + idade

    if genero == 2 and idade < idade_mulher_mais_jovem:
        idade_mulher_mais_jovem = idade

    continuar = int(input("Deseja continuar: 1 - Sim | 2 - Não "))

media_idade_homens = soma_idade_homens / homens_cadastrados

print(f"Maior idade: {maior_idade}.\nHomens cadastrados: {homens_cadastrados}.\n"
      f"Idade da mulher mais jovem: {idade_mulher_mais_jovem}.\nMédia de idade dos homens: {media_idade_homens}.")
