class Ministerio:
    def __init__(self, nombre, direccion="", empleados=None, edades=None, sueldos=None):
        self.nombre = nombre
        self.direccion = direccion
        self.empleados = empleados if empleados else []
        self.edades = edades if edades else []
        self.sueldos = sueldos if sueldos else []
    def mostrar_empleados(self):
        for i in range(len(self.empleados)):
            nombre_completo = " ".join(self.empleados[i])
            print(f"{i + 1}: {nombre_completo}, Edad: {self.edades[i]}, Sueldo: {self.sueldos[i]}")
    # b) Eliminar empleados con edad X
    def eliminar_empleado_por_edad(self, edad_x):
        i = 0
        while i < len(self.edades):
            if self.edades[i] == edad_x:
                self.empleados.pop(i)
                self.edades.pop(i)
                self.sueldos.pop(i)
            else:
                i += 1
    # c) Transferir empleado del segundo al primer objeto (operador simulado)
    def transferir_empleado_desde(self, origen, nombre_empleado):
        for i in range(len(origen.empleados)):
            if " ".join(origen.empleados[i]).lower() == nombre_empleado.lower():
                self.empleados.append(origen.empleados[i])
                self.edades.append(origen.edades[i])
                self.sueldos.append(origen.sueldos[i])

                origen.empleados.pop(i)
                origen.edades.pop(i)
                origen.sueldos.pop(i)
                break
    # d) Mostrar empleados con menor edad o menor sueldo
    def mostrar_empleado_menor(self, criterio="edad"):
      if not self.empleados:
          print("No hay empleados.")
          return
      if criterio == "edad":
          min_valor = min(self.edades)
      elif criterio == "sueldo":
          min_valor = min(self.sueldos)
      else:
          print("Criterio inválido.")
          return
      print(f"Empleados con menor {criterio}:")
      for i in range(len(self.empleados)):
          valor = self.edades[i] if criterio == "edad" else self.sueldos[i]
          if valor == min_valor:
              print(f"Nombre: {' '.join(self.empleados[i])}")
              print(f"Edad: {self.edades[i]}")
              print(f"Sueldo: {self.sueldos[i]}")
              print("------------------------")

# Datos de prueba
empleados = [
    ["Pedro", "Lucy", "Ana", "Saul"],
    ["Rojas", "Sosa", "Perez", "Arce"],
    ["Luna", "Rios", "Rojas" , "Calle"],
    ["Kion", "Alex", "Jauregui", "Coraite"]
]
edades = [35, 43, 26, 29]
sueldos = [2500, 3250, 2700, 2500]
empleados2 = [
    ["Juan", "Pepe", "Cruz", "Mamani"],
    ["Alejandro", "Esteban", "Aruquipa", "Cortez"]
]
edades2 = [35, 43, 26, 29]
sueldos2 = [2500, 3250, 2700, 2500]
# a) Instanciar 2 objetos de diferente forma
ministerio1 = Ministerio("Ministerio de Transporte", "Estación Central, Cementerio, 16 de Julio", empleados, edades, sueldos)
ministerio2 = Ministerio("Ministerio de Energía", "Zona Sur", empleados2, edades2, sueldos2)
# Mostrar empleados de ambos
print("== Ministerio 1 ==")
ministerio1.mostrar_empleados()
print("\n== Ministerio 2 ==")
ministerio2.mostrar_empleados()
# b) Eliminar por edad
print("\n== Ministerio 1 después de eliminar edad 26 ==")
ministerio1.eliminar_empleado_por_edad(26)
ministerio1.mostrar_empleados()
# c) Transferir a Saul del Ministerio 2 al 1
print("\n== Transferir 'Saul Arce Calle' a Ministerio 1 ==")
ministerio1.transferir_empleado_desde(ministerio2, "Juan Pepe Cruz Mamani")
print("Ministerio 1:")
ministerio1.mostrar_empleados()
print("Ministerio 2:")
ministerio2.mostrar_empleados()
# d) Mostrar menor edad y sueldo
print("\n== Menor edad en Ministerio 1 ==")
ministerio1.mostrar_empleado_menor("edad")
print("\n== Menor sueldo en Ministerio 1 ==")
ministerio1.mostrar_empleado_menor("sueldo")