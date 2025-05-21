package objectos.colorados;
import java.util.Random;
public class ObjectosColorados {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        Random random = new Random();
        for (int i = 0; i < figuras.length; i++) {
            int tipo = random.nextInt(2) + 1; // 1 o 2
            String color = (tipo == 1) ? "Rojo" : "Azul";
            double medida = 1 + random.nextDouble() * 9; // Lado o radio entre 1 y 10
            if (tipo == 1) {
                figuras[i] = new Cuadrado(color, medida);
            } else {
                figuras[i] = new Circulo(color, medida);
            }
        }
        for (Figura figura : figuras) {
            System.out.println(figura);
            System.out.printf("Area: %.2f\n", figura.area());
            System.out.printf("Perimetro: %.2f\n", figura.perimetro());
            if (figura instanceof Coloreado) {
                System.out.println(((Coloreado) figura).comoColorear());
            }
            System.out.println("------------------------------");
        }
    }
}
