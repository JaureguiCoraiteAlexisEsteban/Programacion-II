package primerparcial.a.poo;
import java.util.*;
public class LineaTeleferico {
    String color;
    String tramo;
    int nroCabinas;
    int nroEmpleados;
    String[][] empleados = new String[100][3];
    int[] edades = new int[100];
    double[] sueldos = new double[100];
    public LineaTeleferico(String color, String tramo, int nroCabinas, String[][] empleados, int[] edades, double[] sueldos) {
        this.color = color;
        this.tramo = tramo;
        this.nroCabinas = nroCabinas;
        this.nroEmpleados = empleados.length;
        for (int i = 0; i < nroEmpleados; i++) {
            this.empleados[i] = empleados[i];
            this.edades[i] = edades[i];
            this.sueldos[i] = sueldos[i];
        }
    }
    public LineaTeleferico(String color) {
        this.color = color;
        this.tramo = "";
        this.nroCabinas = 0;
        this.nroEmpleados = 0;
    }
    // Método (b) Eliminar empleados con apellido X
    public void eliminarEmpleadoPorApellido(String apellido) {
        for (int i = 0; i < nroEmpleados; i++) {
            if (empleados[i][1].equalsIgnoreCase(apellido) || empleados[i][2].equalsIgnoreCase(apellido)) {
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
    // Método (c) Transferencia de empleado (sobrecarga de operador simulado con método)
    public void transferirEmpleado(LineaTeleferico destino, String nombreEmpleado) {
        for (int i = 0; i < nroEmpleados; i++) {
            String nombreCompleto = String.join(" ", empleados[i]);
            if (nombreCompleto.equalsIgnoreCase(nombreEmpleado)) {
                destino.empleados[destino.nroEmpleados] = empleados[i];
                destino.edades[destino.nroEmpleados] = edades[i];
                destino.sueldos[destino.nroEmpleados] = sueldos[i];
                destino.nroEmpleados++;
                for (int j = i; j < nroEmpleados - 1; j++) {
                    empleados[j] = empleados[j + 1];
                    edades[j] = edades[j + 1];
                    sueldos[j] = sueldos[j + 1];
                }
                nroEmpleados--;
                break;
            }
        }
    }
    // Método (d) Sobrecarga para mostrar empleados por mayor edad o sueldo
    public void mostrarEmpleadosMayor(boolean porEdad) {
        if (nroEmpleados == 0) {
            System.out.println("No hay empleados.");
            return;
        }
        double maxValor = porEdad ? edades[0] : sueldos[0];
        for (int i = 1; i < nroEmpleados; i++) {
            double valor = porEdad ? edades[i] : sueldos[i];
            if (valor > maxValor) {
                maxValor = valor;
            }
        }
        System.out.println("Empleados con mayor " + (porEdad ? "edad" : "sueldo") + ":");
        for (int i = 0; i < nroEmpleados; i++) {
            double valor = porEdad ? edades[i] : sueldos[i];
            if (valor == maxValor) {
                System.out.println("Nombre: " + String.join(" ", empleados[i]));
                System.out.println("Edad: " + edades[i]);
                System.out.println("Sueldo: " + sueldos[i]);
                System.out.println("-----------------------");
            }
        }
    }
    public void mostrarEmpleados() {
        for (int i = 0; i < nroEmpleados; i++) {
            System.out.println((i + 1) + ": " + String.join(" ", empleados[i]) + ", Edad: " + edades[i] + ", Sueldo: " + sueldos[i]);
        }
    }
}
