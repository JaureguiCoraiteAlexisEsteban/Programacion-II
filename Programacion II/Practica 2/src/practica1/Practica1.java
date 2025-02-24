/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

/**
 *
 * @author aalex
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto p1 = new Punto(2, 3);
        Punto p2 = new Punto(6, 7);
        double[] cartesianas = p1.coordCartesianas();
        System.out.println("Coordenadas Cartesianas: ("+ cartesianas[0] + ", " + cartesianas[1] + ")");
        double[] polares = p1.coordPolares();
        System.out.println("Coordenadas Polares: (r=" + polares[0] + ", 0=" + polares[1] + " rad)");
        System.out.println("Representacion de texto: " + p1);
        Linea l = new Linea(p1, p2);
        System.out.println(l);
        l.dibujaLinea();
        Punto centro = new Punto(4, 5);
        Circulo circulo = new Circulo(centro, 3);
        System.out.println(circulo);
        circulo.dibujaCirculo();
    }
    
}
