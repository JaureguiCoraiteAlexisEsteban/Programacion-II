package objectos.colorados;
public class Circulo extends Figura {
    private double radio;
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }
    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
    @Override
    public String toString() {
        return "Circulo - " + super.toString() + ", Radio: " + radio;
    }
}