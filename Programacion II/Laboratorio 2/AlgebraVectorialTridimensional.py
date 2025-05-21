import math

class Vector3D:
    def __init__(self, a1, a2, a3):
        self.a1 = a1
        self.a2 = a2
        self.a3 = a3

    def __add__(self, b):
        return Vector3D(self.a1 + b.a1, self.a2 + b.a2, self.a3 + b.a3)

    def __mul__(self, r):
        return Vector3D(r * self.a1, r * self.a2, r * self.a3)

    def producto_escalar(self, b):
        return self.a1 * b.a1 + self.a2 * b.a2 + self.a3 * b.a3

    def producto_vectorial(self, b):
        i = self.a2 * b.a3 - self.a3 * b.a2
        j = self.a3 * b.a1 - self.a1 * b.a3
        k = self.a1 * b.a2 - self.a2 * b.a1
        return Vector3D(i, j, k)

    def longitud(self):
        return math.sqrt(self.a1 ** 2 + self.a2 ** 2 + self.a3 ** 2)

    def normalizar(self):
        magnitud = self.longitud()
        return Vector3D(self.a1 / magnitud, self.a2 / magnitud, self.a3 / magnitud)

    def proyeccion_sobre(self, b):
        escalar = self.producto_escalar(b) / b.producto_escalar(b)
        return b * escalar

    def son_perpendiculares(self, b):
        return self.producto_escalar(b) == 0

    def son_paralelos(self, b):
        cross = self.producto_vectorial(b)
        return cross.longitud() == 0

    def __str__(self):
        return f"({self.a1}, {self.a2}, {self.a3})"

if __name__ == "__main__":
    v1 = Vector3D(1, 2, 3)
    v2 = Vector3D(4, 5, 6)

    suma = v1 + v2
    print("Suma:", suma)

    producto_escalar = v1.producto_escalar(v2)
    print("Producto Escalar:", producto_escalar)

    producto_vectorial = v1.producto_vectorial(v2)
    print("Producto Vectorial:", producto_vectorial)

    print("Longitud de v1:", v1.longitud())

    normalizado = v1.normalizar()
    print("Normalizado de v1:", normalizado)

    proyeccion = v1.proyeccion_sobre(v2)
    print("Proyección de v1 sobre v2:", proyeccion)

    print("¿Son perpendiculares?", v1.son_perpendiculares(v2))

    print("¿Son paralelos?", v1.son_paralelos(v2))