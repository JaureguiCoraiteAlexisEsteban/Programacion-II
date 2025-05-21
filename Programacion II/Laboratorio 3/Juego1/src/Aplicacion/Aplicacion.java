package Aplicacion;
public class Aplicacion {
    public static void main(String[] args) {
        JuegoAdivinaNumero juego = new JuegoAdivinaNumero(5); // 5 vidas iniciales
        juego.juega();
    }
}
