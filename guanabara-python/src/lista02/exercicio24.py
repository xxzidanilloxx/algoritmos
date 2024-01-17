quantidade_km_percorridos = float(input("Insira a distância a ser percorrida (em km): "))

if quantidade_km_percorridos <= 200:
    preco_viagem = quantidade_km_percorridos * 0.50
else:
    preco_viagem = quantidade_km_percorridos * 0.50

print(f"Preço da viagem: R$ {preco_viagem}")
