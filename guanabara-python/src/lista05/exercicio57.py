continuar = 1
i = 0
soma_salario_homens = 0
soma_salario_mulheres = 0

while continuar == 1:
    salario = float(input("Insira o salário: "))
    genero = int(input("Insira o gênero: 1 - Masculino 2 - Feminino"))

    if genero == 1:
        soma_salario_homens = soma_salario_homens + salario
    else:
        soma_salario_mulheres = soma_salario_mulheres + salario

    continuar = int(input("Deseja continuar? 1 - Sim | 2 - Não"))

print(f"Total salário homens: {soma_salario_homens}.\nTotal salário mulheres: {soma_salario_mulheres}.")
