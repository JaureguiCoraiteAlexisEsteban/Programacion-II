package teatromunicipal;
public abstract class Boleto {
    protected int numeroBoleto;
    protected double precio;
    public Boleto(int numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }
    public abstract String obtenerInformacion();
}