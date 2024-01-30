def maior(a, b, c):
    if a > b and a > c:
        return "O primeiro número é maior."
    elif b > a and b > c:
        return "O segundo número é maior."
    elif c > a and c > b:
        return "O terceiro número é maior."
    else:
        if a == b and a > c:
            return "O primeiro e o segundo número são iguais e maiores que o terceiro."
        elif a == c and a > b:
            return "O primeiro e o terceiro número são iguais e maiores que o segundo."
        elif b == c and b > a:
            return "O segundo e o terceiro número são iguais e maiores que o primeiro."
        else:
            return "Os números são iguais."


a = int(input("Insira o primeiro número: "))
b = int(input("Insira o segundo número: "))
c = int(input("Insira o terceiro número: "))
maior = maior(a, b, c)
print(maior)
