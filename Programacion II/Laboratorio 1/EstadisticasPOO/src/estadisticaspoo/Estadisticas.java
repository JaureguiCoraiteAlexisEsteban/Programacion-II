/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estadisticaspoo;

public class Estadisticas {
    
    private double[] datos;

    public Estadisticas(double[] datos) {
        this.datos = datos;
    }

    public double promedio() {
        double suma = 0;
        for (double num : datos) {
            suma += num;
        }
        return suma / datos.length;
    }

    public double desviacion() {
        double prom = promedio();
        double sumaCuadrados = 0;
        for (double num : datos) {
            sumaCuadrados += Math.pow(num - prom, 2);
        }
        return Math.sqrt(sumaCuadrados / (datos.length - 1));
    }

    public void mostrarResultados() {
        System.out.printf("El promedio es %.2f\n", promedio());
        System.out.printf("La desviacion estandar es %.5f\n", desviacion());
    }
}
