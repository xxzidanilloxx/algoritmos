quantidade_km_percorridos = float(input("Insira a quantidade de km percorridos: "))
quantidade_dias = int(input("Insira a quantidade de dias em que o carro foi alugado: "))
preco_km = quantidade_km_percorridos * 0.20
preco_dia = quantidade_dias * 90
preco_total = preco_km + preco_dia

print(f"Preço total: R$ {preco_total}")
