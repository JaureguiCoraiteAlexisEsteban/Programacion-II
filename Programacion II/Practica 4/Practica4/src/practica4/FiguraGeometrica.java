package practica4;
public class FiguraGeometrica {
    double area(double radio) {
        return Math.PI * radio * radio;
    }
    double area(double base, double altura) {
        return base * altura;
    }
    double area(int tipo, double base, double altura) {
        return (base * altura) / 2;
    }
    double area(int tipo, double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) * altura) / 2;
    }
    double area(int tipo, double lado, int dummy1, int dummy2, int dummy3) {
        return (5 * Math.pow(lado, 2)) / (4 * Math.tan(Math.PI / 5));
    }
    public static void main(String[] args) {
        FiguraGeometrica f1 = new FiguraGeometrica();
        FiguraGeometrica f2 = new FiguraGeometrica();
        FiguraGeometrica f3 = new FiguraGeometrica();
        FiguraGeometrica f4 = new FiguraGeometrica();
        FiguraGeometrica f5 = new FiguraGeometrica(); 
        System.out.println("Circulo: " + f1.area(1));
        System.out.println("Rectangulo: " + f2.area(2, 3));
        System.out.println("Triangulo Rectangulo: " + f3.area(0, 4, 5));
        System.out.println("Trapecio: " + f4.area(0, 3, 5, 4));
        System.out.println("Pentagono: " + f5.area(0, 6, 0, 0, 0));
    }   
}
