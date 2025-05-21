class Anuncio:
    def __init__(self, numero, precio):
        self.numero = numero
        self.precio = precio
    def get_precio(self):
        return self.precio
    def set_precio(self, nuevo_precio):
        self.precio = nuevo_precio
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

print("a. Crear dos objetos pintura con anuncios")
anuncio1 = Anuncio(201, 3000)
anuncio2 = Anuncio(202, 4500)
artista1a = Artista("Luis", "123", 12)
artista1b = Artista("Ana", "456", 8)
pintura1 = Pintura("Naturaleza", "Óleo", artista1a, artista1b, "Paisaje", anuncio1)
artista2a = Artista("Carlos", "789", 10)
artista2b = Artista("Marta", "321", 14)
pintura2 = Pintura("Ciudad", "Acrílico", artista2a, artista2b, "Urbano", anuncio2)
print("\nPintura 1")
pintura1.mostrar()
print("\nPintura 2")
pintura2.mostrar()
print("\nb. Calcular el promedio de años de experiencia de los artistas de ambas pinturas")
suma_experiencia = (pintura1.a1.get_experiencia() + pintura1.a2.get_experiencia() + pintura2.a1.get_experiencia() + pintura2.a2.get_experiencia())
promedio_experiencia = suma_experiencia / 4
print("\nPintura 1\nArtista 1\nNombre: " + artista1a.get_nombre() + ", Años de experiencia: " + str(artista1a.get_experiencia()))
print("Artista 2\nNombre: " + artista1b.get_nombre() + ", Años de experiencia: " + str(artista1b.get_experiencia()))
print("\nPintura 2\nArtista 1\nNombre: " + artista2a.get_nombre() + ", Años de experiencia: " + str(artista2a.get_experiencia()))
print("Artista 2\nNombre: " + artista2b.get_nombre() + ", Años de experiencia: " + str(artista2b.get_experiencia()))
print(f"\nPromedio de años de experiencia de los artistas: {promedio_experiencia}")
print("\nc. Incrementar el precio en X a la pintura del artista con nombre X")
nombre_buscado = "Carlos"
incremento = 500
print("\nNombre del artista en buscar en la pintura 1 y pintura 2 es: " + nombre_buscado + " y el monto a incrementar es: " + str(incremento))
print("\nPintura 1\nArtista 1\n"  + artista1a.get_nombre())
print("Artista 2\n" + artista1b.get_nombre())
print("\nPintura 2\nArtista 1\n"  + artista2a.get_nombre())
print("Artista 2\n" + artista2b.get_nombre())
print("\nPrecio de la Pintura 1 antes del Incremento\n" + str(pintura1.get_precio_venta()))
print("Precio de la Pintura 2 antes del Incremento\n" + str(pintura2.get_precio_venta()))
def contiene_artista_con_nombre(pintura, nombre):
    return (pintura.a1.get_nombre().lower() == nombre.lower() or pintura.a2.get_nombre().lower() == nombre.lower())
def incrementar_precio(pintura, incremento):
    if pintura.anuncio:
        nuevo_precio = pintura.anuncio.get_precio() + incremento
        pintura.anuncio.set_precio(nuevo_precio)
if contiene_artista_con_nombre(pintura1, nombre_buscado):
    incrementar_precio(pintura1, incremento)
    print("\nSe incrementó el precio de la pintura 1 por " + str(incremento))
if contiene_artista_con_nombre(pintura2, nombre_buscado):
    incrementar_precio(pintura2, incremento)
    print("\nSe incrementó el precio de la pintura 2 por " + str(incremento))
print(f"\nPrecio final pintura 1: {pintura1.get_precio_venta()}")
print(f"Precio final pintura 2: {pintura2.get_precio_venta()}")