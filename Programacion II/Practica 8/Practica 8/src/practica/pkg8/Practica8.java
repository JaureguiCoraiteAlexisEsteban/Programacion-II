package practica.pkg8;
public class Practica8 {
    public static void main(String[] args) {
        D obj = new D(1, 2, 3);
        System.out.println("Puntos Originales de A y B");
        obj.mostrarValores();
        obj.incrementaXYZ();
        System.out.println("Puntos Incrementados de A y B");
        obj.mostrarValores();
    }
}
