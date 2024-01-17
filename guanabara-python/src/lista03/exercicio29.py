nome = input("Insira o nome do funcionário: ")
salario = float(input("Insira o salário do funcionário: "))
tempo_empresa = int(input("Insira o tempo de serviço do funcionário na empresa: "))

if tempo_empresa <= 3:
    aumento = (salario * 3) / 100
    novo_salario = salario + aumento
    print(f"Salário: {salario}. Salário reajustado (+ 3%): {novo_salario}")
elif tempo_empresa > 3 and tempo_empresa < 10:
    aumento = (salario * 12.5) / 100
    novo_salario = salario + aumento
    print(f"Salário: {salario}. Salário reajustado (+ 12.5%): {novo_salario}")
else:
    aumento = (salario * 20) / 100
    novo_salario = salario + aumento
    print(f"Salário: {salario}. Salário reajustado (+ 20%): {novo_salario}")
