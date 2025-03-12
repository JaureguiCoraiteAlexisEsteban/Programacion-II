/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 *
 * @author aalex
 */
public class Pila {
    public int arreglo[];
    public int top;
    public int n;
    public Pila(int n) {
        arreglo = new int[n];
        top = -1;
        this.n = n;
    }
    public void push(int e) {
        if (isFull()) {
            System.out.println("Pila llena");
        } else {
            top++;
            arreglo[top] = e;
        }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Pila vacia");
            return -1;
        } else {
            int e = arreglo[top];
            top--;
            return e;
        }
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public int peek() {
        return arreglo[top];
    }
    public boolean isFull(){
        return (n - 1 == top);
    }
    public int size(){
        return n;
    }
}
