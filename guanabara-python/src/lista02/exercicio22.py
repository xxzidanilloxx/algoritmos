ano_nascimento = int(input("Insira o ano de nascimento: "))
ano_atual = int(input("Insira o ano atual: "))
idade = ano_atual - ano_nascimento

if idade < 18:
    tempo = 18 - idade
    print(f"Faltam {tempo} anos para o alistamento militar.")
else:
    tempo = idade - 18
    print(f"Passaram-se {tempo} anos do alistamento militar.")
