package objectos.colorados;
public abstract class Figura {
    private String color;
    public Figura(String color) {
        this.color = color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public String toString() {
        return "Color: " + color;
    }
    public abstract double area();
    public abstract double perimetro();
}