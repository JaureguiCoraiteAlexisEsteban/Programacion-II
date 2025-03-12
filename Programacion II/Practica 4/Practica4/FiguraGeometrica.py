import math
class FiguraGeometrica:
    def area(self, *args):
        if len(args) == 1:
            radio = args[0]
            return math.pi * radio ** 2
        elif len(args) == 2:
            base, altura = args
            return base * altura
        elif len(args) == 3:
            _, base, altura = args
            return (base * altura) / 2
        elif len(args) == 4:
            _, base_mayor, base_menor, altura = args
            return ((base_mayor + base_menor) * altura) / 2
        elif len(args) == 5:
            _, lado, _, _, _ = args
            return (5 * lado ** 2) / (4 * math.tan(math.pi / 5))
f1 = FiguraGeometrica()
f2 = FiguraGeometrica()
f3 = FiguraGeometrica()
f4 = FiguraGeometrica()
f5 = FiguraGeometrica()
print("Circulo:", f1.area(1))
print("Rectangulo:", f2.area(2, 3))
print("Triangulo Rectangulo:", f3.area(0, 4, 5))
print("Trapecio:", f4.area(0, 3, 5, 4))
print("Pentagono:", f5.area(0, 6, 0, 0, 0))