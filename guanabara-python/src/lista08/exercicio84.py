vetor_a = []
vetor_b = []

for i in range(5):
    nome = input("Insira o nome: ")
    vetor_a.append(nome)
    idade = int(input("Insira a idade: "))
    vetor_b.append(idade)

for i in range(5):
    if vetor_b[i] < 18:
        print(f"Nome: {vetor_a[i]}. Idade: {vetor_b[i]} anos.")
