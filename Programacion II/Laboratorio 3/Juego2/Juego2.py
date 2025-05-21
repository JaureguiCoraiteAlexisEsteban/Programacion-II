import random
class Juego:
    def __init__(self, numero_de_vidas):
        self.numero_de_vidas = numero_de_vidas
        self.record = float('inf')
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
    def valida_numero(self, numero):
        return 0 <= numero <= 10
    def juega(self):
        self.reinicia_partida()
        self.numero_a_adivinar = random.randint(0, 10)
        intentos = 0
        print("Adivina un número entre 0 y 10")
        while True:
            try:
                numero_usuario = int(input("Ingresa tu número: "))
                if not self.valida_numero(numero_usuario):
                    print("Número inválido.")
                    continue
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
                print("Entrada inválida. Por favor, escribe un número entero.")

class JuegoAdivinaPar(JuegoAdivinaNumero):
    def valida_numero(self, numero):
        if 0 <= numero <= 10:
            if numero % 2 != 0:
                return True
            else:
                print("Error: El número no es impar.")
                return False
        print("Número fuera de rango (0-10).")
        return False

class JuegoAdivinaImpar(JuegoAdivinaNumero):
    def valida_numero(self, numero):
        if 0 <= numero <= 10:
            if numero % 2 == 0:
                return True
            else:
                print("Error: El número no es par.")
                return False
        print("Número fuera de rango (0-10).")
        return False

print("--- Juego Adivina Número ---")
juego1 = JuegoAdivinaNumero(3)
juego1.juega()
print("\n--- Juego Adivina Número Par ---")
juego3 = JuegoAdivinaImpar(3)
juego3.juega()
print("\n--- Juego Adivina Número Impar ---")
juego2 = JuegoAdivinaPar(3)
juego2.juega()