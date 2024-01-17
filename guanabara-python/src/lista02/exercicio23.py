nome = input("Insira o nome: ")
genero = input("Insira o gênero (M ou F): ")
valor_compra = float(input("Insira o valor da compra: "))

if genero == "M":
    desconto = (valor_compra * 5) / 100
    novo_valor_compra = valor_compra - desconto
    print(f"Valor: {valor_compra}. Valor (com 5% de desconto): {novo_valor_compra}")
else:
    desconto = (valor_compra * 13) / 100
    novo_valor_compra = valor_compra - desconto
    print(f"Valor: {valor_compra}. Valor (com 13% de desconto): {novo_valor_compra}")
