from abc import ABC, abstractmethod
import random
import math

class Coloreado(ABC):
    @abstractmethod
    def como_colorear(self):
        pass

class Figura(ABC):
    def __init__(self, color):
        self.color = color
    def set_color(self, color):
        self.color = color
    def get_color(self):
        return self.color
    def __str__(self):
        return f"Color: {self.color}"
    @abstractmethod
    def area(self):
        pass
    @abstractmethod
    def perimetro(self):
        pass

class Cuadrado(Figura, Coloreado):
    def __init__(self, color, lado):
        super().__init__(color)
        self.lado = lado
    def area(self):
        return self.lado ** 2
    def perimetro(self):
        return 4 * self.lado
    def como_colorear(self):
        return "Colorear los cuatro lados"
    def __str__(self):
        return f"Cuadrado - {super().__str__()}, Lado: {self.lado}"

class Circulo(Figura):
    def __init__(self, color, radio):
        super().__init__(color)
        self.radio = radio
    def area(self):
        return math.pi * self.radio ** 2
    def perimetro(self):
        return 2 * math.pi * self.radio
    def __str__(self):
        return f"Circulo - {super().__str__()}, Radio: {self.radio}"

figuras = []

for _ in range(5):
    tipo = random.randint(1, 2)  # 1-Cuadrado, 2-Circulo
    color = "Rojo" if tipo == 1 else "Azul"
    medida = random.uniform(1, 10)  # entre 1 y 10

    if tipo == 1:
        figuras.append(Cuadrado(color, medida))
    else:
        figuras.append(Circulo(color, medida))

for figura in figuras:
    print(figura)
    print(f"Área: {figura.area():.2f}")
    print(f"Perímetro: {figura.perimetro():.2f}")

    if isinstance(figura, Coloreado):
        print(figura.como_colorear())
    print("-" * 30)