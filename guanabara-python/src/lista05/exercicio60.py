continuar = 1
homens_acima_30 = 0
mulheres_menores_18 = 0
maior_idade = 0
soma_idade = 0
i = 0

while continuar == 1:
    nome = input("Insira o nome: ")
    idade = int(input("Insira a idade: "))
    genero = int(input("Insira o gênero: 1 - Masculino 2 - Feminino"))

    if idade > maior_idade:
        nome_pessoa_mais_velha = nome

        if genero == 2:
            nome_mulher_mais_velha = nome

    soma_idade = soma_idade + idade

    if genero == 1 and idade > 30:
        homens_acima_30 = homens_acima_30 + 1

    if genero == 2 and idade < 18:
        mulheres_menores_18 = mulheres_menores_18 + 1

    i = i + 1
    continuar = int(input("Deseja continuar? 1 - Sim | 2 - Não"))

media_idade = soma_idade / i

print(f"Nome da pessoa mais velha: {nome_pessoa_mais_velha}.\nNome da mulher mais velha: {nome_mulher_mais_velha}."
      f"\nMédia de idade: {media_idade}.\nHomens com mais de 30 anos: {homens_acima_30}."
      f"\nMulheres com menos de 18 anos: {mulheres_menores_18}.")
