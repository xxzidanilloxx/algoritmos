vetor = []
soma_nota = 0
quantidade_notas = 0
maior_nota = 0
alunos_acima_media = 0

for i in range(5):
    nota = float(input("Insira a nota: "))
    vetor.append(nota)

    if nota > maior_nota:
        maior_nota = nota

    soma_nota = soma_nota + nota
    quantidade_notas = quantidade_notas + 1

media_nota = soma_nota / quantidade_notas

for i in range(5):
    if vetor[i] > media_nota:
        alunos_acima_media = alunos_acima_media + 1

print(f"Média: {media_nota}.\nQuantidade de alunos acima da média: {alunos_acima_media}.\n"
      f"Maior nota: {maior_nota}.")

print("Posição da maior nota:")
for i in range(5):
    if vetor[i] == maior_nota:
        print(f"Nota: {vetor[i]} | Posição: {i}")
