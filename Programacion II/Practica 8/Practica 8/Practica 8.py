class A:
    def __init__(self, x, z):
        self.x = x
        self.z = z
    def incrementaXZ(self):
        self.x += 1
        self.z += 1
    def IncrementaZ(self):
        self.z += 1

class B:
    def __init__(self, y, z):
        self.y = y
        self.z = z
    def incrementaYZ(self):
        self.y += 1
        self.z += 1
    def IncrementaZ(self):
        self.z += 1

class D(A, B):
    def __init__(self, x, y, z):
        A.__init__(self, x, z)
        B.__init__(self, y, z)
    def incrementaXYZ(self):
        self.x += 1
        self.y += 1
        self.z += 1

d = D(1, 2, 3)
print("Puntos Originales")
print("x_A:",d.x, "z_A:",d.z)
print("x_B:",d.y, "z_B:",d.z)
print("x_D:",d.x, "y_D:",d.y, "z_D:",d.z)
d.incrementaXYZ()
print("Puntos Incrementados")
print("x_A:",d.x, "z_A:",d.z)
print("x_B:",d.y, "z_B:",d.z)
print("x_D:",d.x, "y_D:",d.y, "z_D:",d.z)