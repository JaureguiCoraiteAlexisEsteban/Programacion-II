/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecuacionescuadraticas;

import java.util.Scanner;

public class EcuacionesCuadraticasModularyEstructura {

    public static double getDiscriminante(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static double getRaiz1(double a, double b, double discriminante) {
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }

    public static double getRaiz2(double a, double b, double discriminante) {
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }

    public static void resolverEcuacion(double a, double b, double c) {
        double discriminante = getDiscriminante(a, b, c);
        
        if (discriminante > 0) {
            double r1 = getRaiz1(a, b, discriminante);
            double r2 = getRaiz2(a, b, discriminante);
            System.out.printf("La ecuacion tiene dos raices %.5f y %.5f\n", r1, r2);
        } else if (discriminante == 0) {
            double r = -b / (2 * a);
            System.out.printf("La ecuacion tiene una raiz %.0f\n", r);
        } else {
            System.out.println("La ecuacion no tiene raices reales");
        }
    }

    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingrese a, b, c: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            resolverEcuacion(a, b, c);
        }
        sc.close();
    }
}
