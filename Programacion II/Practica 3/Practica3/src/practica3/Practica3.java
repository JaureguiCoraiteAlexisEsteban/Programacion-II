/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;

/**
 *
 * @author aalex
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--- Prueba de la Pila ---");
        Pila pila = new Pila(3);
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println("Capacidad de elementos en la pila = " + pila.size());
        System.out.println(pila.peek());
        System.out.println("pop() = " + pila.pop());
        System.out.println(pila.peek());
        System.out.println("pop() = " + pila.pop());
        System.out.println(pila.peek());
        System.out.println("pop() = " + pila.pop());
        System.out.println("\n--- Prueba de la Cola ---");
        Cola cola = new Cola(3);
        cola.insert(10);
        cola.insert(20);
        cola.insert(30);
        System.out.println("Cantidad de elementos en la cola = " + cola.size());
        System.out.println(cola.peek());
        System.out.println("remove() = " + cola.remove());
        System.out.println(cola.peek());
        System.out.println("remove() = " + cola.remove());
        System.out.println(cola.peek());
        System.out.println("remove() = " + cola.remove());
    }
}
