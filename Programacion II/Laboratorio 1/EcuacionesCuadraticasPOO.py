import math

class EcuacionCuadratica:
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c

    def get_discriminante(self):
        return self.b**2 - 4*self.a*self.c

    def get_raiz1(self):
        discriminante = self.get_discriminante()
        if discriminante >= 0:
            return (-self.b + math.sqrt(discriminante)) / (2 * self.a)
        return None

    def get_raiz2(self):
        discriminante = self.get_discriminante()
        if discriminante > 0:
            return (-self.b - math.sqrt(discriminante)) / (2 * self.a)
        return None

    def resolver(self):
        discriminante = self.get_discriminante()
        if discriminante > 0:
            print(f"La ecuación tiene dos raíces {self.get_raiz1():.5f} y {self.get_raiz2():.5f}")
        elif discriminante == 0:
            print(f"La ecuación tiene una raíz {self.get_raiz1():.0f}")
        else:
            print("La ecuación no tiene raíces reales")

for i in range(3):
    a, b, c = map(float, input("Ingrese a, b, c: ").split())
    ecuacion = EcuacionCuadratica(a, b, c)
    ecuacion.resolver()