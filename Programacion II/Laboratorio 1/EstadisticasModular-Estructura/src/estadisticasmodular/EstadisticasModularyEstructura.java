/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estadisticasmodular;

import java.util.Scanner;

public class EstadisticasModularyEstructura {

    public static double promedio(double[] datos) {
        double suma = 0;
        for (double num : datos) {
            suma += num;
        }
        return suma / datos.length;
    }

    public static double desviacion(double[] datos, double promedio) {
        double sumaCuadrados = 0;
        for (double num : datos) {
            sumaCuadrados += Math.pow(num - promedio, 2);
        }
        return Math.sqrt(sumaCuadrados / (datos.length - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];
        System.out.println("Ingrese 10 numeros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }
        sc.close();
        double prom = promedio(numeros);
        double desv = desviacion(numeros, prom);
        System.out.printf("El promedio es %.2f\n", prom);
        System.out.printf("La desviacion estandar es %.5f\n", desv);
    }
}
