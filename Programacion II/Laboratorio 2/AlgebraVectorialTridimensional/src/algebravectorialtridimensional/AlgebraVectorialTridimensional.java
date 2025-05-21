package algebravectorialtridimensional;
public class AlgebraVectorialTridimensional{
    private double a1, a2, a3;

    public AlgebraVectorialTridimensional(double a1, double a2, double a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public AlgebraVectorialTridimensional sumar(AlgebraVectorialTridimensional b) {
        return new AlgebraVectorialTridimensional(this.a1 + b.a1, this.a2 + b.a2, this.a3 + b.a3);
    }

    public AlgebraVectorialTridimensional multiplicar(double r) {
        return new AlgebraVectorialTridimensional(r * this.a1, r * this.a2, r * this.a3);
    }

    public double productoEscalar(AlgebraVectorialTridimensional b) {
        return this.a1 * b.a1 + this.a2 * b.a2 + this.a3 * b.a3;
    }

    public AlgebraVectorialTridimensional productoVectorial(AlgebraVectorialTridimensional b) {
        double i = this.a2 * b.a3 - this.a3 * b.a2;
        double j = this.a3 * b.a1 - this.a1 * b.a3;
        double k = this.a1 * b.a2 - this.a2 * b.a1;
        return new AlgebraVectorialTridimensional(i, j, k);
    }

    public double longitud() {
        return Math.sqrt(this.a1 * this.a1 + this.a2 * this.a2 + this.a3 * this.a3);
    }

    public AlgebraVectorialTridimensional normalizar() {
        double magnitud = longitud();
        return new AlgebraVectorialTridimensional(this.a1 / magnitud, this.a2 / magnitud, this.a3 / magnitud);
    }

    public AlgebraVectorialTridimensional proyeccionSobre(AlgebraVectorialTridimensional b) {
        double escalar = this.productoEscalar(b) / b.productoEscalar(b);
        return b.multiplicar(escalar);
    }

    public boolean sonPerpendiculares(AlgebraVectorialTridimensional b) {
        return this.productoEscalar(b) == 0;
    }

    public boolean sonParalelos(AlgebraVectorialTridimensional b) {
        AlgebraVectorialTridimensional cross = this.productoVectorial(b);
        return cross.longitud() == 0;
    }
    
    public void dibujar(AlgebraVectorialTridimensional b) {
        AlgebraVectorialTridimensional suma = this.sumar(b);
        System.out.println("Suma de los vectores a y b: ");
        System.out.println("a + b = (" + this.a1 + " + " + b.a1 + ", " + this.a2 + " + " + b.a2 + ", " + this.a3 + " + " + b.a3 + ")");
        System.out.println("Resultado: " + suma);

        double productoEscalar = this.productoEscalar(b);
        System.out.println("\nProducto escalar de a y b: ");
        System.out.println("a · b = (" + this.a1 + " * " + b.a1 + " + " + this.a2 + " * " + b.a2 + " + " + this.a3 + " * " + b.a3 + ")");
        System.out.println("Resultado: " + productoEscalar);

        AlgebraVectorialTridimensional productoVectorial = this.productoVectorial(b);
        System.out.println("\nProducto vectorial de a y b: ");
        System.out.println("a × b = (" + this.a2 + " * " + b.a3 + " - " + this.a3 + " * " + b.a2 + ", " + this.a3 + " * " + b.a1 + " - " + this.a1 + " * " + b.a3 + ", " + this.a1 + " * " + b.a2 + " - " + this.a2 + " * " + b.a1 + ")");
        System.out.println("Resultado: " + productoVectorial);

        System.out.println("\nLongitud de a: ");
        System.out.println("|a| = √(" + this.a1 + "² + " + this.a2 + "² + " + this.a3 + "²)");
        System.out.println("Resultado: " + this.longitud());

        AlgebraVectorialTridimensional normalizado = this.normalizar();
        System.out.println("\nNormalización de a: ");
        System.out.println("Normalizado(a) = (" + this.a1 + " / |a|, " + this.a2 + " / |a|, " + this.a3 + " / |a|)");
        System.out.println("Resultado: " + normalizado);

        AlgebraVectorialTridimensional proyeccion = this.proyeccionSobre(b);
        System.out.println("\nProyección de a sobre b: ");
        System.out.println("Proyección(a sobre b) = (a · b / b · b) * b");
        System.out.println("Resultado: " + proyeccion);

        System.out.println("\n¿Son a y b perpendiculares?");
        System.out.println("Resultado: " + (this.sonPerpendiculares(b) ? "Sí" : "No"));

        System.out.println("\n¿Son a y b paralelos?");
        System.out.println("Resultado: " + (this.sonParalelos(b) ? "Sí" : "No"));
    }

    @Override
    public String toString() {
        return "(" + a1 + ", " + a2 + ", " + a3 + ")";
    }

    public static void main(String[] args) {
        AlgebraVectorialTridimensional v1 = new AlgebraVectorialTridimensional(1, 2, 3);
        AlgebraVectorialTridimensional v2 = new AlgebraVectorialTridimensional(4, 5, 6);

        v1.dibujar(v2);
    }
    
}
