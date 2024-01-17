largura = float(input("Insira a largura do terreno: "))
comprimento = float(input("Insira o comprimento do terreno: "))
area = largura * comprimento

if area < 100:
    print(f"Área: {area}. Tipo do terreno: Popular")
elif area >= 100 and area < 500:
    print(f"Área: {area}. Tipo do terreno: Master")
else:
    print(f"Área: {area}. Tipo do terreno: VIP")
