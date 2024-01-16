preco = float(input("Insira o preço de um produto: "))
desconto = preco * 5 / 100
novo_preco = preco - desconto

print(f"Preço: R$ {preco}. Preço (5% de desconto): R$ {novo_preco}")
