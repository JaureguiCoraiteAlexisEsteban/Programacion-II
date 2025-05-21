class LineaTeleferico:
    def __init__(self, color, tramo="", nro_cabinas=0, empleados=None, edades=None, sueldos=None):
        self.color = color
        self.tramo = tramo
        self.nro_cabinas = nro_cabinas
        self.empleados = empleados if empleados else []
        self.edades = edades if edades else []
        self.sueldos = sueldos if sueldos else []
    def mostrar_empleados(self):
        for i in range(len(self.empleados)):
            nombre_completo = " ".join(self.empleados[i])
            print(f"{i + 1}: {nombre_completo}, Edad: {self.edades[i]}, Sueldo: {self.sueldos[i]}")
    # b) Eliminar empleados con apellido X
    def eliminar_empleado_por_apellido(self, apellido):
        i = 0
        while i < len(self.empleados):
            if apellido.lower() in [self.empleados[i][1].lower(), self.empleados[i][2].lower()]:
                self.empleados.pop(i)
                self.edades.pop(i)
                self.sueldos.pop(i)
            else:
                i += 1
    # c) Sobrecarga de "operador" para transferir empleados (método personalizado)
    def transferir_empleado(self, destino, nombre_completo):
        for i in range(len(self.empleados)):
            if " ".join(self.empleados[i]).lower() == nombre_completo.lower():
                destino.empleados.append(self.empleados[i])
                destino.edades.append(self.edades[i])
                destino.sueldos.append(self.sueldos[i])
                self.empleados.pop(i)
                self.edades.pop(i)
                self.sueldos.pop(i)
                break
    # d) Sobrecarga de método para mayor edad o mayor sueldo
    def mostrar_empleado_mayor(self, criterio="edad"):
        if not self.empleados:
            print("No hay empleados.")
            return
        if criterio == "edad":
            max_valor = max(self.edades)
        elif criterio == "sueldo":
            max_valor = max(self.sueldos)
        else:
            print("Criterio inválido.")
            return
        print(f"Empleados con mayor {criterio}:")
        for i in range(len(self.empleados)):
            valor = self.edades[i] if criterio == "edad" else self.sueldos[i]
            if valor == max_valor:
                print(f"Nombre: {' '.join(self.empleados[i])}")
                print(f"Edad: {self.edades[i]}")
                print(f"Sueldo: {self.sueldos[i]}")
                print("------------------------")

# Datos iniciales
empleados1 = [
    ["Pedro", "Rojas", "Luna"],
    ["Lucy", "Sosa", "Rios"],
    ["Ana", "Perez", "Rojas"],
    ["Saul", "Arce", "Calle"]
]
edades1 = [35, 43, 26, 29]
sueldos1 = [2700, 3250, 2700, 2500]
# a) Instanciación
rojo = LineaTeleferico("Rojo", "Estación Central, Cementerio, 16 de Julio", 20, empleados1, edades1, sueldos1)
azul = LineaTeleferico("Azul")
# Mostrar empleados iniciales
print("== Empleados Rojo ==")
rojo.mostrar_empleados()
print("== Empleados Azul ==")
azul.mostrar_empleados()
# b) Eliminar empleados con apellido "Rojas"
rojo.eliminar_empleado_por_apellido("Sosa")
print("\n== Después de eliminar 'Rojas' ==")
rojo.mostrar_empleados()
# c) Transferir a Saul Arce Calle
rojo.transferir_empleado(azul, "Saul Arce Calle")
print("\n== Después de transferir a Saul ==")
print("Rojo:")
rojo.mostrar_empleados()
print("Azul:")
azul.mostrar_empleados()
# d) Mostrar empleado con mayor edad y mayor sueldo
print("\n== Mayor Edad en Rojo ==")
rojo.mostrar_empleado_mayor("edad")
print("\n== Mayor Sueldo en Rojo ==")
rojo.mostrar_empleado_mayor("sueldo")