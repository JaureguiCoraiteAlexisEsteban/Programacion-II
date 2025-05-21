import numpy as np

class AlgebraVectorial:
    def __init__(self, a=None, b=None):
        self.vectorA = np.array(a if a is not None else [0, 0, 0], dtype=float)
        self.vectorB = np.array(b if b is not None else [0, 0, 0], dtype=float)

    def norma(self, v):
        return np.linalg.norm(v)

    def producto_punto(self, a, b):
        return np.dot(a, b)

    def es_perpendicular(self):
        return np.isclose(self.norma(self.vectorA + self.vectorB), self.norma(self.vectorA - self.vectorB))

    def es_perpendicular_mutuo(self):
        return np.isclose(self.norma(self.vectorA - self.vectorB), self.norma(self.vectorB - self.vectorA))

    def es_perpendicular_dot(self):
        return np.isclose(self.producto_punto(self.vectorA, self.vectorB), 0)

    def es_perpendicular_pitagoras(self):
        return np.isclose(self.norma(self.vectorA + self.vectorB) ** 2, self.norma(self.vectorA) ** 2 + self.norma(self.vectorB) ** 2)

    def es_paralelo_escalar(self, escalar):
        vectorB_escalado = escalar * self.vectorB
        return np.allclose(self.vectorA, vectorB_escalado)

    def es_paralelo_cruz(self):
        return np.allclose(np.cross(self.vectorA, self.vectorB), [0, 0, 0])

    def proyeccion_sobre_b(self):
        factor = self.producto_punto(self.vectorA, self.vectorB) / (self.norma(self.vectorB) ** 2)
        return factor * self.vectorB

    def componente_en_b(self):
        return self.producto_punto(self.vectorA, self.vectorB) / self.norma(self.vectorB)

a = [6, 8, 0]
b = [3, 4, 0]

algebra = AlgebraVectorial(a, b)

escalar = 2

print("¿Son perpendiculares?", algebra.es_perpendicular())
print("¿Son mutuamente ortogonales?", algebra.es_perpendicular_mutuo())
print("¿Son ortogonales (producto punto)?", algebra.es_perpendicular_dot())
print("¿Cumplen el teorema de Pitágoras?", algebra.es_perpendicular_pitagoras())
print(f"¿Son paralelos con escalar {escalar}? {algebra.es_paralelo_escalar(escalar)}")
print("¿Son paralelos (producto cruz)?", algebra.es_paralelo_cruz())

proy = algebra.proyeccion_sobre_b()
print(f"Proyección de A sobre B: {proy}")

print("Componente de A en dirección de B:", algebra.componente_en_b())