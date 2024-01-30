def media(a, b):
    return (a + b)/2


def situacao(media):
    if media >= 7:
        return "APROVADO"
    elif media >= 5:
        return "RECUPERAÇÃO"
    else:
        return "REPROVADO"


a = float(input("Insira a primeira nota: "))
b = float(input("Insira a segunda nota: "))
media = media(a, b)
print(media)
situacao = situacao(media)
print(situacao)
