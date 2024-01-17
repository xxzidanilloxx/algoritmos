valor_casa = float(input("Insira o valor da casa: "))
salario = float(input("Insira o salário do comprador: "))
tempo_pagamento = int(input("Em quantos anos o comprador pretende pagar a casa? "))
quantidade_parcelas = tempo_pagamento * 12
valor_parcelas = valor_casa / quantidade_parcelas

if valor_parcelas < (salario * 30)/100:
    print("Empréstimo aprovado.")
else:
    print("Empréstimo reprovado.")
