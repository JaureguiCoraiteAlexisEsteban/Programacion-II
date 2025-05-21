package primerparcial.b.poo;
public class PrimerParcialBPOO {
    public static void main(String[] args) {
        String[][] empleados = {
            {"Pedro", "Rojas", "Luna"},
            {"Lucy", "Sosa", "Rios"},
            {"Ana", "Perez", "Rojas"},
            {"Saul", "Arce", "Calle"}
        };
        int[] edades = {29, 43, 26, 29};
        double[] sueldos = {2500, 3250, 2700, 2500};
        // a) Instanciar 2 objetos Ministerio de diferente forma
        String[][] emp1 = {empleados[0], empleados[1]};
        int[] ed1 = {edades[0], edades[1]};
        double[] su1 = {sueldos[0], sueldos[1]};
        Ministerio ministerio1 = new Ministerio("Ministerio de Transporte", "Estación Central", emp1, ed1, su1);
        String[][] emp2 = {empleados[2], empleados[3]};
        int[] ed2 = {edades[2], edades[3]};
        double[] su2 = {sueldos[2], sueldos[3]};
        Ministerio ministerio2 = new Ministerio("Ministerio de Energía", "Zona Sur", emp2, ed2, su2);
        // Mostrar empleados iniciales
        System.out.println("== Ministerio 1 ==");
        ministerio1.mostrarEmpleados();
        System.out.println("\n== Ministerio 2 ==");
        ministerio2.mostrarEmpleados();
        // b) Eliminar empleado por edad
        System.out.println("\n== Ministerio 2 despues de eliminar edad 26 ==");
        ministerio2.eliminarEmpleadoPorEdad(26);
        ministerio2.mostrarEmpleados();
        // c) Transferir Saul Arce Calle del ministerio2 al ministerio1
        System.out.println("\n== Transferencia de 'Saul Arce Calle' a Ministerio 1 ==");
        ministerio1.transferirEmpleadoDesde(ministerio2, "Saul Arce Calle");
        System.out.println("Ministerio 1:");
        ministerio1.mostrarEmpleados();
        System.out.println("Ministerio 2:");
        ministerio2.mostrarEmpleados();
        // d) Mostrar menor edad y menor sueldo
        System.out.println("\n== Menor edad en Ministerio 1 ==");
        ministerio1.mostrarEmpleadoMenor(true);
        System.out.println("\n== Menor sueldo en Ministerio 1 ==");
        ministerio1.mostrarEmpleadoMenor(false);
    }
}
