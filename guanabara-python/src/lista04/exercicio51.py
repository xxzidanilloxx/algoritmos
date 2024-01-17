i = 0

preco = float(input("Insira o preço de um produto: "))
maior_preco = preco
menor_preco = preco

while i <= 7:
    preco = float(input("Insira o preço de um produto: "))

    if preco >= maior_preco:
        maior_preco = preco

    if preco <= menor_preco:
        menor_preco = preco

    i = i + 1

print(f"Menor preco: R$ {menor_preco}. Maior preço: {maior_preco}")
