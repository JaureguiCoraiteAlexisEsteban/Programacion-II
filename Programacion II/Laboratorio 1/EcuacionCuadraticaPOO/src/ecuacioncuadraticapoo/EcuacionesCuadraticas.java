/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecuacioncuadraticapoo;

public class EcuacionesCuadraticas {
    
    private double a;
    private double b;
    private double c;
    
    public EcuacionesCuadraticas(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }

    public Double getRaiz1() {
        double discriminante = getDiscriminante();
        return discriminante >= 0 ? (-b + Math.sqrt(discriminante)) / (2 * a) : null;
    }

    public Double getRaiz2() {
        double discriminante = getDiscriminante();
        return discriminante > 0 ? (-b - Math.sqrt(discriminante)) / (2 * a) : null;
    }

    public void resolver() {
        double discriminante = getDiscriminante();
        if (discriminante > 0) {
            System.out.printf("La ecuacion tiene dos raices %.6f y %.6f\n", getRaiz1(), getRaiz2());
        } else if (discriminante == 0) {
            System.out.printf("La ecuacion tiene una raiz %.0f\n", getRaiz1());
        } else {
            System.out.println("La ecuacion no tiene raices reales");
        }
    }
}
