package segundoparcial.b.poo;
public class Anuncio {
    private int numero;
    private double precio;
    public Anuncio(int numero, double precio) {
        this.numero = numero;
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }
    public void mostrar() {
        System.out.println("Anuncio N°" + numero + ", Precio: " + precio);
    }
}
