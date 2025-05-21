package teatromunicipal;
public class Platea extends Boleto {
    public Platea(int numeroBoleto, int diasAnticipacion) {
        super(numeroBoleto);
        if (diasAnticipacion >= 10) {
            this.precio = 50.0;
        } else {
            this.precio = 60.0;
        }
    }
    @Override
    public String obtenerInformacion() {
        return "Numero: " + numeroBoleto + ", Precio: " + precio;
    }
}