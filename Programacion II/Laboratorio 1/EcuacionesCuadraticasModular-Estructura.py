import math

def get_discriminante(a, b, c):
    return b**2 - 4*a*c

def get_raiz1(a, b, discriminante):
    return (-b + math.sqrt(discriminante)) / (2 * a)

def get_raiz2(a, b, discriminante):
    return (-b - math.sqrt(discriminante)) / (2 * a)

def resolver_ecuacion(a, b, c):
    discriminante = get_discriminante(a, b, c)
    
    if discriminante > 0:
        r1 = get_raiz1(a, b, discriminante)
        r2 = get_raiz2(a, b, discriminante)
        print(f"La ecuación tiene dos raíces {r1:.5f} y {r2:.5f}")
    elif discriminante == 0:
        r = -b / (2 * a)
        print(f"La ecuación tiene una raíz {r:.0f}")
    else:
        print("La ecuación no tiene raíces reales")

for i in range(3):
    a, b, c = map(float, input("Ingrese a, b, c: ").split())
    resolver_ecuacion(a, b, c)