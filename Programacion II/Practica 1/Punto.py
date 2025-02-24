import math
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
if __name__ == "__main__":
    p = Punto(3, 4)
    print(f"Coordenadas Cartesianas: {p.coord_cartesianas()}")
    print(f"Coordenadas Polares: {p.coord_polares()}")
    print(f"Representación de texto: {p}")
   