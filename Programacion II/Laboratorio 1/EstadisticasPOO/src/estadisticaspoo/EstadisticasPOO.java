/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estadisticaspoo;

import java.util.Scanner;

public class EstadisticasPOO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];
        System.out.println("Ingrese 10 numeros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }
        sc.close();
        Estadisticas estadisticas = new Estadisticas(numeros);
        estadisticas.mostrarResultados();
    }
    
}
