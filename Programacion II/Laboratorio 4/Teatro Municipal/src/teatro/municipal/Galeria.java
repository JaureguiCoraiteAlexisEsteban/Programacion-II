package teatromunicipal;
public class Galeria extends Boleto {
    public Galeria(int numeroBoleto, int diasAnticipacion) {
        super(numeroBoleto);
        if (diasAnticipacion >= 10) {
            this.precio = 25.0;
        } else {
            this.precio = 30.0;
        }
    }
    @Override
    public String obtenerInformacion() {
        return "Numero: " + numeroBoleto + ", Precio: " + precio;
    }
}
