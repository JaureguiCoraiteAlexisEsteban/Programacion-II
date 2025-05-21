import random
class Juego:
    def __init__(self, numero_de_vidas):
        self.numero_de_vidas = numero_de_vidas
        self.record = float('inf')  # Inicia con un valor alto
    def reinicia_partida(self):
        print("Reiniciando partida...")
    def actualiza_record(self, intentos):
        if intentos < self.record:
            self.record = intentos
            print(f"¡Nuevo récord! {self.record} intentos.")
    def quita_vida(self):
        self.numero_de_vidas -= 1
        print(f"Te quedan {self.numero_de_vidas} vidas.")
        return self.numero_de_vidas > 0

class JuegoAdivinaNumero(Juego):
    def __init__(self, numero_de_vidas):
        super().__init__(numero_de_vidas)
        self.numero_a_adivinar = 0
    def juega(self):
        self.reinicia_partida()
        self.numero_a_adivinar = random.randint(0, 10)
        intentos = 0
        print("Adivina un número entre 0 y 10")
        while True:
            try:
                numero_usuario = int(input("Ingresa tu número: "))
                intentos += 1
                if numero_usuario == self.numero_a_adivinar:
                    print("¡Acertaste!")
                    self.actualiza_record(intentos)
                    break
                else:
                    if not self.quita_vida():
                        print(f"Has perdido. El número era {self.numero_a_adivinar}")
                        break
                    else:
                        if numero_usuario < self.numero_a_adivinar:
                            print("El número a adivinar es mayor.")
                        else:
                            print("El número a adivinar es menor.")
            except ValueError:
                print("Por favor, ingresa un número válido.")

juego = JuegoAdivinaNumero(5)  # 5 vidas
juego.juega()