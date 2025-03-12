/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 *
 * @author aalex
 */
public class Cola {
    public int arreglo[];
    public int inicio;
    public int fin;
    public int n;
    public int cantidad;
    public Cola(int n) {
        arreglo = new int[n];
        this.inicio = 0;
        this.fin = -1;
        this.n = n;
        this.cantidad =  0;
    }
    public void insert(int e) {
        if (isFull()) {
            System.out.println("Cola llena");
        } else {
            fin = (fin + 1) % n;
            arreglo[fin] = e;
            cantidad++;
        }
    }
    public long remove(){
        if (isEmpty()) {
            System.out.println("Cola vacia");
            return -1;
        } else {
            int e = arreglo[inicio];
            inicio = (inicio + 1) % n;
            cantidad--;
            return e;
        }
    }
    public int peek() {
        return arreglo[inicio];
    }
    public boolean isEmpty() {
        return cantidad == 0;
    }
    public boolean isFull() {
        return cantidad == n;
    }
    public int size() {
        return cantidad;
    }
}
