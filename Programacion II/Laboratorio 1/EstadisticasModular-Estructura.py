import math

def promedio(numeros):
    return sum(numeros) / len(numeros)

def desviacion(numeros, promedio_val):
    suma_cuadrados = sum((x - promedio_val) ** 2 for x in numeros)
    return math.sqrt(suma_cuadrados / (len(numeros) - 1))

numeros = list(map(float, input("Ingrese 10 números: ").split()))

prom = promedio(numeros)
desv = desviacion(numeros, prom)

print(f"El promedio es {prom:.2f}")
print(f"La desviación estándar es {desv:.5f}")