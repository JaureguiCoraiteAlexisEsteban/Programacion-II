import math
import matplotlib.pyplot as plt
class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y
    def coord_cartesianas(self):
        return (self.x, self.y)
    def coord_polares(self):
        r = math.sqrt(self.x ** 2 + self.y ** 2)
        theta = math.atan2(self.y, self.x)
        return (r, theta)
    def __str__(self):
        return f"Punto({self.x}, {self.y})"
class Linea:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2
    def __str__(self):
        return f"Linea({self.p1}, {self.p2})"
    def dibujaLinea(self):
        plt.plot([self.p1.x, self.p2.x], [self.p1.y, self.p2.y], 'bo-', label="Línea")
        plt.xlabel("X")
        plt.ylabel("Y")
        plt.legend()
        plt.grid(True)
        plt.title("Dibujo de Línea")
        plt.show()
class Circulo:
    def __init__(self, centro, radio):
        self.centro = centro
        self.radio = float(radio)
    def __str__(self):
        return f"Circulo(Centro: {self.centro}, Radio: {self.radio})"
    def dibujaCirculo(self):
        fig, ax = plt.subplots()
        circulo = plt.Circle((self.centro.x, self.centro.y), self.radio, color='r', fill=False, label="Círculo")
        ax.add_patch(circulo)
        ax.set_xlim(self.centro.x - self.radio - 1, self.centro.x + self.radio + 1)
        ax.set_ylim(self.centro.y - self.radio - 1, self.centro.y + self.radio + 1)
        ax.set_aspect('equal')
        plt.grid(True)
        plt.title("Dibujo de Círculo")
        plt.legend()
        plt.show()

if __name__ == "__main__":
    p1 = Punto(1, 2)
    print(f"Coordenadas Cartesianas: {p1.coord_cartesianas()}")
    print(f"Coordenadas Polares: {p1.coord_polares()}")
    print(f"Representación de texto: {p1}")
    p2 = Punto(5, 7)
    l = Linea(p1, p2)
    print(l)
    l.dibujaLinea()
    centro = Punto(3, 3)
    circulo = Circulo(centro, 2)
    print(circulo)
    circulo.dibujaCirculo()