a = int(input("Insira um número inteiro: "))
b = int(input("Insira outro número inteiro: "))

if a > b:
    print(f"O primeiro número ({a}) é maior que o segundo número ({b}).")
elif b > a:
    print(f"O segundo número ({b}) é maior que o primeiro número ({a}).")
else:
    print(f"Não existe número maior, os dois são iguais.")
