quantidade_cigarros_dia = int(input("Quantos cigarros você fuma por dia? "))
anos_fumante = int(input("Há quantos anos você fuma? "))
minutos_perdidos_dia = quantidade_cigarros_dia * 10
minutos_perdidos_ano = minutos_perdidos_dia * 365
minutos_vida_perdidos = minutos_perdidos_ano * anos_fumante
dias_vida_perdidos = (minutos_vida_perdidos/60)/24

print(f"Dias de vida perdidos: {dias_vida_perdidos}")
