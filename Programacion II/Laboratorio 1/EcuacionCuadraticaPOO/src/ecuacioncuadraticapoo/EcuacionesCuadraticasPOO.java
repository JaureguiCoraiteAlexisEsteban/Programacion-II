/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecuacioncuadraticapoo;

import java.util.Scanner;

public class EcuacionesCuadraticasPOO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingrese a, b, c: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            EcuacionesCuadraticas ecuacion = new EcuacionesCuadraticas(a, b, c);
            ecuacion.resolver();
        }
        sc.close();
    }
    
}
