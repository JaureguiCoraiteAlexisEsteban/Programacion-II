package primerparcial.a.poo;
public class PrimerParcialAPOO {
    public static void main(String[] args) {
        String[][] empleados1 = {
            {"Pedro", "Rojas", "Luna"},
            {"Lucy", "Sosa", "Rios"},
            {"Ana", "Perez", "Rojas"},
            {"Saul", "Arce", "Calle"}
        };
        int[] edades1 = {35, 35, 26, 29};
        double[] sueldos1 = {2500, 2500, 2700, 2500};
        // a) Instanciación
        LineaTeleferico rojo = new LineaTeleferico("Rojo", "Estación Central, Cementerio, 16 de Julio", 20, empleados1, edades1, sueldos1);
        LineaTeleferico azul = new LineaTeleferico("Azul");
        // Mostrar original
        rojo.mostrarEmpleados();
        // b) Eliminar empleados con apellido "Rojas"
        rojo.eliminarEmpleadoPorApellido("Perez");
        System.out.println("\nDespues de eliminar apellido Rojas:");
        rojo.mostrarEmpleados();
        // c) Transferir empleado a azul
        rojo.transferirEmpleado(azul, "Saul Arce Calle");
        System.out.println("\nDespues de transferir Saul a azul:");
        System.out.println("Rojo:");
        rojo.mostrarEmpleados();
        System.out.println("Azul:");
        azul.mostrarEmpleados();
        // d) Mostrar mayor edad y mayor sueldo
        rojo.mostrarEmpleadosMayor(true);  // Por edad
        rojo.mostrarEmpleadosMayor(false); // Por sueldo
    }
}
