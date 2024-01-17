tipo_carro = int(input("Insira o tipo do carro: 1 - Carro popular. 2 - Carro esportivo. "))
quantidade_dias = int(input("Insira a quantidade de dias em que o carro será alugado: "))
quantidade_km_percorridos = int(input("Insira a distância a ser percorrida (em km): "))

if tipo_carro == 1:
    if quantidade_km_percorridos <= 100:
        preco_km = quantidade_km_percorridos * 0.20
        preco_dia = quantidade_dias * 90
        preco_total = preco_km + preco_dia
    else:
        preco_km = quantidade_km_percorridos * 0.10
        preco_dia = quantidade_dias * 90
        preco_total = preco_km + preco_dia
elif tipo_carro == 2:
    if quantidade_km_percorridos <= 200:
        preco_km = quantidade_km_percorridos * 0.30
        preco_dia = quantidade_dias * 150
        preco_total = preco_km + preco_dia
    else:
        preco_km = quantidade_km_percorridos * 0.25
        preco_dia = quantidade_dias * 150
        preco_total = preco_km + preco_dia
else:
    print("O tipo de carro inserido não existe.")

print(f"Preço da viagem: R$ {preco_total}")
