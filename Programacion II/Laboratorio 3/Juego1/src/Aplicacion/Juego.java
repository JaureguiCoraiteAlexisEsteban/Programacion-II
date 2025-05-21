package Aplicacion;
public class Juego {
    private int numeroDeVidas;
    private int record;
    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = Integer.MAX_VALUE; // Inicialmente, un valor alto para comparaciones
    }
    public void reiniciaPartida() {
        System.out.println("Reiniciando partida...");
    }
    public void actualizaRecord(int intentos) {
        if (intentos < record) {
            record = intentos;
            System.out.println("Nuevo record: " + record + " intentos.");
        }
    }
    public boolean quitaVida() {
        numeroDeVidas--;
        System.out.println("Te quedan " + numeroDeVidas + " vidas.");
        return numeroDeVidas > 0;
    }
}
