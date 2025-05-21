from abc import ABC, abstractmethod

class Boleto(ABC):
    def __init__(self, numero_boleto):
        self.numero_boleto = numero_boleto
        self.precio = 0.0
    @abstractmethod
    def obtener_informacion(self):
        pass

class Palco(Boleto):
    def __init__(self, numero_boleto):
        super().__init__(numero_boleto)
        self.precio = 100.0
    def obtener_informacion(self):
        return f"Número: {self.numero_boleto}, Precio: {self.precio}"

class Platea(Boleto):
    def __init__(self, numero_boleto, dias_anticipacion):
        super().__init__(numero_boleto)
        self.precio = 50.0 if dias_anticipacion >= 10 else 60.0
    def obtener_informacion(self):
        return f"Número: {self.numero_boleto}, Precio: {self.precio}"
      
class Galeria(Boleto):
    def __init__(self, numero_boleto, dias_anticipacion):
        super().__init__(numero_boleto)
        self.precio = 25.0 if dias_anticipacion >= 10 else 30.0
    def obtener_informacion(self):
        return f"Número: {self.numero_boleto}, Precio: {self.precio}"

continuar = True
while continuar:
    print("\nSeleccione el tipo de boleto:")
    print("1. Palco")
    print("2. Platea")
    print("3. Galeria")
    print("4. Salir")
    opcion = input("Opción: ")
    if opcion == '1':
        num_palco = int(input("Ingrese el número de boleto: "))
        palco = Palco(num_palco)
        print(palco.obtener_informacion())
    elif opcion == '2':
        num_platea = int(input("Ingrese el número de boleto: "))
        dias_platea = int(input("Ingrese los días de anticipación: "))
        platea = Platea(num_platea, dias_platea)
        print(platea.obtener_informacion())
    elif opcion == '3':
        num_galeria = int(input("Ingrese el número de boleto: "))
        dias_galeria = int(input("Ingrese los días de anticipación: "))
        galeria = Galeria(num_galeria, dias_galeria)
        print(galeria.obtener_informacion())
    elif opcion == '4':
        continuar = False
        print("Saliendo del programa...")
    else:
        print("Opción inválida. Intente de nuevo.")