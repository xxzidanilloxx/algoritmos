a = int(input("Insira o tamanho de um segmento de reta: "))
b = int(input("Insira o tamanho de outro segmento de reta: "))
c = int(input("Insira o tamanho de outro segmento de reta: "))

if a < b + c and b < a + c and c < b + a:
    print(f"É possível formar um triângulo com as medidas informadas.")
else:
    print(f"Não é possível formar um triângulo com as medidas informadas.")
