package Aplicacion;
import java.util.Random;
import java.util.Scanner;
public class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;
    private Random random;
    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
        random = new Random();
    }
    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = random.nextInt(11); // Número entre 0 y 10
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;     
        System.out.println("Adivina un numero entre 0 y 10");
        while (true) {
            System.out.print("Ingresa tu numero: ");
            int numeroUsuario = scanner.nextInt();
            intentos++;           
            if (numeroUsuario == numeroAAdivinar) {
                System.out.println("Acertaste!!");
                actualizaRecord(intentos);
                break;
            } else {
                if (!quitaVida()) {
                    System.out.println("Has perdido. El numero era " + numeroAAdivinar);
                    break;
                } else {
                    if (numeroUsuario < numeroAAdivinar) {
                        System.out.println("El numero a adivinar es mayor.");
                    } else {
                        System.out.println("El numero a adivinar es menor.");
                    }
                }
            }
        }
    }
}
