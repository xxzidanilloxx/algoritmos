mulheres_cadastradas = 0
homens_mais_100kg = 0
soma_peso_mulheres = 0
maior_peso_homens = 0

for i in range(0, 9):
    genero = int(input("Insira o gênero: 1 - Masculino | 2 - Feminino "))
    peso = float(input("Insira o peso: "))

    if genero == 1:
        if peso > maior_peso_homens:
            maior_peso_homens = peso

        if peso > 100:
            homens_mais_100kg = homens_mais_100kg + 1

    elif genero == 2:
        mulheres_cadastradas = mulheres_cadastradas + 1
        soma_peso_mulheres = soma_peso_mulheres + peso

    else:
        print("Insira um gênero válido.")

media_peso_mulheres = soma_peso_mulheres / mulheres_cadastradas

print(f"Mulheres cadastradas: {mulheres_cadastradas}.\nHomens que pesam mais de 100kg: {homens_mais_100kg}."
      f"\nMédia de peso entre as mulheres: {media_peso_mulheres}.\nMaior peso entre os homens: {maior_peso_homens}.")
