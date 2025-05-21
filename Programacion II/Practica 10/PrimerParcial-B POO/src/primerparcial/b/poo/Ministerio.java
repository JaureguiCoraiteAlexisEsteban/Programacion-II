package primerparcial.b.poo;
import java.util.*;
public class Ministerio {
    String nombre;
    String direccion;
    int nroEmpleados;
    String[][] empleados = new String[100][3];
    int[] edades = new int[100];
    double[] sueldos = new double[100];
    public Ministerio(String nombre, String direccion, String[][] empleados, int[] edades, double[] sueldos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nroEmpleados = empleados.length;
        for (int i = 0; i < nroEmpleados; i++) {
            this.empleados[i] = empleados[i];
            this.edades[i] = edades[i];
            this.sueldos[i] = sueldos[i];
        }
    }
    public Ministerio(String nombre) {
        this.nombre = nombre;
        this.direccion = "";
        this.nroEmpleados = 0;
    }
    public void mostrarEmpleados() {
        for (int i = 0; i < nroEmpleados; i++) {
            System.out.println((i + 1) + ": " + String.join(" ", empleados[i]) +
                ", Edad: " + edades[i] + ", Sueldo: " + sueldos[i]);
        }
    }
    // (b) Eliminar empleados con edad X
    public void eliminarEmpleadoPorEdad(int edadX) {
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] == edadX) {
                for (int j = i; j < nroEmpleados - 1; j++) {
                    empleados[j] = empleados[j + 1];
                    edades[j] = edades[j + 1];
                    sueldos[j] = sueldos[j + 1];
                }
                nroEmpleados--;
                i--;
            }
        }
    }
    // (c) Transferir empleado desde otro objeto
    public void transferirEmpleadoDesde(Ministerio origen, String nombreEmpleado) {
        for (int i = 0; i < origen.nroEmpleados; i++) {
            String nombreCompleto = String.join(" ", origen.empleados[i]);
            if (nombreCompleto.equalsIgnoreCase(nombreEmpleado)) {
                this.empleados[this.nroEmpleados] = origen.empleados[i];
                this.edades[this.nroEmpleados] = origen.edades[i];
                this.sueldos[this.nroEmpleados] = origen.sueldos[i];
                this.nroEmpleados++;

                for (int j = i; j < origen.nroEmpleados - 1; j++) {
                    origen.empleados[j] = origen.empleados[j + 1];
                    origen.edades[j] = origen.edades[j + 1];
                    origen.sueldos[j] = origen.sueldos[j + 1];
                }
                origen.nroEmpleados--;
                break;
            }
        }
    }
    // (d) Mostrar empleado con menor edad o menor sueldo
    public void mostrarEmpleadoMenor(boolean porEdad) {
        if (nroEmpleados == 0) {
            System.out.println("No hay empleados.");
            return;
        }
        int minValor = porEdad ? edades[0] : (int) sueldos[0];
        for (int i = 1; i < nroEmpleados; i++) {
            int valor = porEdad ? edades[i] : (int) sueldos[i];
            if (valor < minValor) {
                minValor = valor;
            }
        }
        System.out.println("Empleados con menor " + (porEdad ? "edad" : "sueldo") + ":");
        for (int i = 0; i < nroEmpleados; i++) {
            int valor = porEdad ? edades[i] : (int) sueldos[i];
            if (valor == minValor) {
                System.out.println("Nombre: " + String.join(" ", empleados[i]));
                System.out.println("Edad: " + edades[i]);
                System.out.println("Sueldo: " + sueldos[i]);
                System.out.println("-----------------------");
            }
        }
    }
}