class Anuncio:
    def __init__(self, numero, precio):
        self.numero = numero
        self.precio = precio
    def get_precio(self):
        return self.precio
    def mostrar(self):
        print(f"Anuncio: N°{self.numero}, Precio: {self.precio}")

class Artista:
    def __init__(self, nombre, ci, años_experiencia):
        self.nombre = nombre
        self.ci = ci
        self.años_experiencia = años_experiencia
    def get_experiencia(self):
        return self.años_experiencia
    def get_nombre(self):
        return self.nombre
    def mostrar(self):
        print(f"Nombre: {self.nombre}, CI: {self.ci}, Años de experiencia: {self.años_experiencia}")

class Obra:
    def __init__(self, titulo, material, artista1, artista2, anuncio=None):
        self.titulo = titulo
        self.material = material
        self.a1 = artista1
        self.a2 = artista2
        self.anuncio = anuncio
    def get_artista_mas_experimentado(self):
        return self.a1 if self.a1.get_experiencia() > self.a2.get_experiencia() else self.a2
    def agregar_anuncio(self, anuncio):
        self.anuncio = anuncio
    def get_precio_venta(self):
        return self.anuncio.get_precio() if self.anuncio else 0
    def mostrar(self):
        print(f"\nObra: {self.titulo}")
        print(f"Material: {self.material}")
        self.a1.mostrar()
        self.a2.mostrar()
        if self.anuncio:
            self.anuncio.mostrar()
        else:
            print("Sin anuncio.")

class Pintura(Obra):
    def __init__(self, titulo, material, artista1, artista2, genero, anuncio=None):
        super().__init__(titulo, material, artista1, artista2, anuncio)
        self.genero = genero
    def mostrar(self):
        super().mostrar()
        print(f"Género: {self.genero}")

print("a. Crear una pintura con anuncio y otra sin anuncio")
anuncio1 = Anuncio(101, 5000)
artista1a = Artista("Luis", "123", 10)
artista1b = Artista("Ana", "456", 15)
pintura1 = Pintura("Atardecer", "Óleo", artista1a, artista1b, "Paisaje", anuncio1)
artista2a = Artista("Carlos", "789", 8)
artista2b = Artista("Marta", "321", 12)
pintura2 = Pintura("Amanecer", "Acrílico", artista2a, artista2b, "Retrato")
print("\nPintura 1")
pintura1.mostrar()
print("\nPintura 2")
pintura2.mostrar()
print("\nb. Mostrar el artista con más años de experiencia de ambas pinturas")
print("\nPintura 1\nArtista 1\nNombre: " + artista1a.get_nombre() + ", Años de experiencia: " + str(artista1a.get_experiencia()))
print("Artista 2\nNombre: " + artista1b.get_nombre() + ", Años de experiencia: " + str(artista1b.get_experiencia()))
print("\nPintura 2\nArtista 1\nNombre: " + artista2a.get_nombre() + ", Años de experiencia: " + str(artista2a.get_experiencia()))
print("Artista 2\nNombre: " + artista2b.get_nombre() + ", Años de experiencia: " + str(artista2b.get_experiencia()))
artista_mas_experiencia_p1 = pintura1.get_artista_mas_experimentado()
artista_mas_experiencia_p2 = pintura2.get_artista_mas_experimentado()
print(f"\nEl artista más experimentado en pintura 1 es: {artista_mas_experiencia_p1.get_nombre()} con {artista_mas_experiencia_p1.get_experiencia()} años")
print(f"El artista más experimentado en pintura 2 es: {artista_mas_experiencia_p2.get_nombre()} con {artista_mas_experiencia_p2.get_experiencia()} años")
if artista_mas_experiencia_p1.get_experiencia() > artista_mas_experiencia_p2.get_experiencia():
    artista_top = artista_mas_experiencia_p1
else:
    artista_top = artista_mas_experiencia_p2
print(f"\nEl artista con más experiencia de ambas pinturas es: {artista_top.get_nombre()}" + " con " + str(artista_top.get_experiencia()) + " años")
print("\nc. Agregar anuncio a pintura2 y determinar el precio total\n")
nuevo_anuncio = Anuncio(102, 4000)
nuevo_anuncio.mostrar()
pintura2.agregar_anuncio(nuevo_anuncio)
print("\nPintura 2");
pintura2.mostrar()
total_venta = pintura1.get_precio_venta() + pintura2.get_precio_venta()
print("\nPrecio de la Pintura 1\n" + str(pintura1.get_precio_venta()))
print("Precio de la Pintura 2\n" + str(pintura2.get_precio_venta()))
print(f"\nPrecio total de venta de ambas pinturas: ${total_venta}")