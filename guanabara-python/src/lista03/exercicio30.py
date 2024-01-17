a = int(input("Insira o tamanho de um segmento de reta: "))
b = int(input("Insira o tamanho de outro segmento de reta: "))
c = int(input("Insira o tamanho de outro segmento de reta: "))

if a < b + c and b < a + c and c < b + a:
    if a == b and b == c:
        print("Triângulo equilátero.")
    elif a == b or b == c or a == c:
        print("Triângulo isósceles.")
    else:
        print("Triângulo escaleno")
else:
    print(f"Não é possível formar um triângulo com as medidas informadas.")
