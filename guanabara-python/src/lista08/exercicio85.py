vetor_a = []
vetor_b = []
vetor_c = []

for i in range(5):
    nome = input("Insira o nome: ")
    vetor_a.append(nome)
    genero = int(input("Insira o gênero: 1 - Masculino. | 2 - Feminino "))
    vetor_b.append(genero)
    salario = float(input("Insira o salário: "))
    vetor_c.append(salario)

for i in range(5):
    if vetor_b[i] == 2 and vetor_c[i] > 5000:
        print(f"Nome: {vetor_a[i]}. Gênero: Feminino. Salário: R$ {vetor_c[i]}.")
