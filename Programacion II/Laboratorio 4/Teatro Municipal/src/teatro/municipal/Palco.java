package teatromunicipal;
public class Palco extends Boleto {

    public Palco(int numeroBoleto) {
        super(numeroBoleto);
        this.precio = 100.0;
    }
    @Override
    public String obtenerInformacion() {
        return "Numero: " + numeroBoleto + ", Precio: " + precio;
    }
}