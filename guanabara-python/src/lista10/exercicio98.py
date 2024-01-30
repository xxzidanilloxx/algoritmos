def super_somador(a, b):
    soma = 0
    for i in range(a, b):
        soma = soma + i
    return soma


a = int(input("Insira um número: "))
b = int(input("Insira outro número: "))
resultado = super_somador(a, b)
print(resultado)
