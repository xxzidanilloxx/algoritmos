quantidade_horas_atividade = int(input("Insira a quantidade de horas de atividade física realizadas no mês: "))

if quantidade_horas_atividade <= 10:
    pontos = quantidade_horas_atividade * 2
elif quantidade_horas_atividade > 10 and quantidade_horas_atividade <= 20:
    pontos = quantidade_horas_atividade * 5
else:
    pontos = quantidade_horas_atividade * 10

valor = pontos * 0.05
print(f"Valor: R$ {valor}")
