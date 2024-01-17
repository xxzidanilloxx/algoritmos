n1 = float(input("Insira a primeira nota: "))
n2 = float(input("Insira a segunda nota: "))
media = (n1 + n2)/2

if media >= 7:
    print(f"Média: {media}. Aluno aprovado.")
else:
    print(f"Média: {media}. Aluno reprovado")
