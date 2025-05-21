package teatromunicipal;
import java.util.Scanner;
public class TeatroMunicipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nSeleccione el tipo de boleto:");
            System.out.println("1. Palco");
            System.out.println("2. Platea");
            System.out.println("3. Galeria");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el numero de boleto: ");
                    int numPalco = sc.nextInt();
                    Palco palco = new Palco(numPalco);
                    System.out.println(palco.obtenerInformacion());
                    break;
                case 2:
                    System.out.print("Ingrese el numero de boleto: ");
                    int numPlatea = sc.nextInt();
                    System.out.print("Ingrese los dias de anticipacion: ");
                    int diasPlatea = sc.nextInt();
                    Platea platea = new Platea(numPlatea, diasPlatea);
                    System.out.println(platea.obtenerInformacion());
                    break;
                case 3:
                    System.out.print("Ingrese el numero de boleto: ");
                    int numGaleria = sc.nextInt();
                    System.out.print("Ingrese los dias de anticipacion: ");
                    int diasGaleria = sc.nextInt();
                    Galeria galeria = new Galeria(numGaleria, diasGaleria);
                    System.out.println(galeria.obtenerInformacion());
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
                    break;
            }
        }
        sc.close();
    }
}
