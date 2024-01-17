i = 0
soma_altura = 0
mais_90kg = 0
menos_50kg_160m = 0
mais_100kg_190m = 0

while i < 5:
    peso = float(input("Insira o peso: "))
    altura = float(input("Insira a altura: "))

    soma_altura = soma_altura + altura

    if peso > 90:
        mais_90kg = mais_90kg + 1

    if peso < 50 and altura < 1.60:
        menos_50kg_160m

    if peso > 90 and altura > 1.90:
        mais_100kg_190m

    i = i + 1

media_altura = soma_altura / i

print(f"Média de altura: {media_altura}\nPessoas com mais de 90kg: {mais_90kg}"
      f"\nPessoas que pesam menos de 50Kg e medem menos de 1.60m: {menos_50kg_160m}"
      f"\nPessoas que pesam mais de 100Kg e medem mais de 1.90m: {mais_100kg_190m}")
