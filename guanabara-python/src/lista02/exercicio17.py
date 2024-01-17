velocidade = int(input("Insira a velocidade do veículo: "))
velocidade_excedente = velocidade - 80
multa = velocidade_excedente * 5

if velocidade > 80:
    print(f"Velocidade: {velocidade}. Usuário multado! \n Valor da multa: {multa}")
else:
    print(f"{velocidade}")
