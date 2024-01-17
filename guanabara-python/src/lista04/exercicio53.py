i = 0
homens_cadastrados = 0
mulheres_cadastradas = 0
mulheres_acima_20 = 0
soma_idade = 0
soma_idade_homens = 0

while i < 5:
    idade = int(input("Insira a idade: "))
    genero = int(input("Insira o gênero (1 - Masculino 2 - Feminino): "))

    if genero == 1:
        homens_cadastrados = homens_cadastrados + 1
        soma_idade_homens = soma_idade_homens + idade
    else:
        mulheres_cadastradas = mulheres_cadastradas + 1

    if genero == 2 and idade > 20:
        mulheres_acima_20 = mulheres_acima_20 + 1

    soma_idade = soma_idade + idade
    i = i + 1

media = soma_idade / i
media_idade_homens = soma_idade_homens / homens_cadastrados

print(f"Homens cadastrados: {homens_cadastrados}\nMulheres cadastradas: {mulheres_cadastradas}\nMédia de idade: {media}"
      f"\nMédia de idade dos homens: {media_idade_homens}\nMulheres com mais de 20 anos: {mulheres_acima_20}")
