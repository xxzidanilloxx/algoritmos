peso = float(input("Insira o peso: "))
altura = float(input("Insira a altura: "))
imc = peso / (altura * altura)

if imc < 18.5:
    print(f"IMC: {imc}. Classificação: Abaixo do peso.")
elif imc >= 18.5 and imc < 25:
    print(f"IMC: {imc}. Classificação: Peso ideal.")
elif imc >= 25 and imc < 30:
    print(f"IMC: {imc}. Classificação: Sobrepeso.")
elif imc >= 30 and imc < 40:
    print(f"IMC: {imc}. Classificação: Obesidade.")
else:
    print(f"IMC: {imc}. Classificação: Obesidade mórbida.")
