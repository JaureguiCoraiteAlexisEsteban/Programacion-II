package segundoparcial.b.poo;
public class SegundoParcialBPOO {
    public static void main(String[] args) {
        System.out.println("a. Crear dos objetos pintura con anuncios de venta");
        Anuncio anuncio1 = new Anuncio(201, 3000);
        Anuncio anuncio2 = new Anuncio(202, 4500);
        Artista artista1a = new Artista("Luis", "111", 12);
        Artista artista1b = new Artista("Ana", "112", 8);
        Pintura pintura1 = new Pintura("Naturaleza", "Óleo", artista1a, artista1b, "Paisaje", anuncio1);
        Artista artista2a = new Artista("Carlos", "113", 10);
        Artista artista2b = new Artista("Marta", "114", 14);
        Pintura pintura2 = new Pintura("Ciudad", "Acrílico", artista2a, artista2b, "Urbano", anuncio2);
        System.out.println("\nPintura 1");
        pintura1.mostrar();
        System.out.println("\nPintura 2");
        pintura2.mostrar();
        System.out.println("\nb. Calcular el promedio de años de experiencia de los artistas de ambas pinturas");
        int sumaAnios = artista1a.getAñosExperiencia() + artista1b.getAñosExperiencia()
                      + artista2a.getAñosExperiencia() + artista2b.getAñosExperiencia();
        double promedio = sumaAnios / 4.0;
        System.out.println("\nPintura 1\nArtista 1\nNombre: " + artista1a.getNombre() + ", Años de experiencia: " + artista1a.getAñosExperiencia());
        System.out.println("Artista 2\nNombre: " + artista1b.getNombre() + ", Años de experiencia: " + artista1b.getAñosExperiencia());
        System.out.println("\nPintura 2\nArtista 1\nNombre: " + artista2a.getNombre() + ", Años de experiencia: " + artista2a.getAñosExperiencia());
        System.out.println("Artista 2\nNombre: " + artista2b.getNombre() + ", Años de experiencia: " + artista2b.getAñosExperiencia());
        System.out.println("\nPromedio de años de experiencia de los artistas es: " + promedio);
        System.out.println("\nc. Incrementar el precio en X a la pintura donde haya un artista con nombre X");
        String nombreBuscado = "Carlos";
        double incremento = 500;
        System.out.println("\nNombre del artista en buscar en la pintura 1 y pintura 2 es: " + nombreBuscado + " y el monto a incrementar es: " + incremento);
        System.out.println("\nPintura 1\nArtista 1\n" + artista1a.getNombre());
        System.out.println("Artista 2\n" + artista1b.getNombre());
        System.out.println("\nPintura 2\nArtista 1\n" + artista2a.getNombre());
        System.out.println("Artista 2\n" + artista2b.getNombre());
        System.out.println("\nPrecio de la Pintura 1 antes del Incremento\n" + pintura1.getPrecioVenta());
        System.out.println("Precio de la Pintura 2 antes del Incremento\n" + pintura2.getPrecioVenta());
        if (contieneArtistaConNombre(pintura1, nombreBuscado)) {
            incrementarPrecio(pintura1, incremento);
            System.out.println("\nSe incrementó el precio de la pintura 1 por " + incremento);
        }
        if (contieneArtistaConNombre(pintura2, nombreBuscado)) {
            incrementarPrecio(pintura2, incremento);
            System.out.println("\nSe incrementó el precio de la pintura 2 por " + incremento);
        }
        System.out.println("\nPrecio final pintura 1: " + pintura1.getPrecioVenta());
        System.out.println("Precio final pintura 2: " + pintura2.getPrecioVenta());
    }
    public static boolean contieneArtistaConNombre(Pintura pintura, String nombre) {
        return pintura.a1.getNombre().equalsIgnoreCase(nombre) || pintura.a2.getNombre().equalsIgnoreCase(nombre);
    }
    public static void incrementarPrecio(Pintura pintura, double incremento) {
        if (pintura.anuncio != null) {
            double nuevoPrecio = pintura.anuncio.getPrecio() + incremento;
            pintura.anuncio.setPrecio(nuevoPrecio);
        }
    }   
}
