salario_atual = float(input("Insira o salário do funcionário: "))
genero = input("Insira o gênero do funcionário (M ou F): ")
tempo_empresa = int(input("Insira o tempo de serviço do funcionário na empresa: "))

if genero == 'F':
    if tempo_empresa < 15:
        aumento = (salario_atual * 5)/100
    elif tempo_empresa >= 15 and tempo_empresa >= 20:
        aumento = (salario_atual * 12) / 100
    else:
        aumento = (salario_atual * 23) / 100
else:
    if tempo_empresa < 20:
        aumento = (salario_atual * 3) / 100
    elif tempo_empresa >= 20 and tempo_empresa >= 30:
        aumento = (salario_atual * 13) / 100
    else:
        aumento = (salario_atual * 25) / 100

novo_salario = salario_atual + aumento
print(f"Salário reajustado: R$ {novo_salario}")
