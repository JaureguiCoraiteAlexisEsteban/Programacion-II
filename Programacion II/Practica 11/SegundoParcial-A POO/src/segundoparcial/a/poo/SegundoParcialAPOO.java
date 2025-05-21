package segundoparcial.a.poo;
public class SegundoParcialAPOO {
    public static void main(String[] args) {
        System.out.println("a. Crear una pintura con anuncio y otra sin anuncio");
        Anuncio anuncio1 = new Anuncio(101, 5000);
        Artista artista1a = new Artista("Luis", "123", 10);
        Artista artista1b = new Artista("Ana", "456", 15);
        Pintura pintura1 = new Pintura("Atardecer", "Óleo", artista1a, artista1b, "Paisaje", anuncio1);
        Artista artista2a = new Artista("Carlos", "789", 8);
        Artista artista2b = new Artista("Marta", "321", 12);
        Pintura pintura2 = new Pintura("Amanecer", "Acrílico", artista2a, artista2b, "Retrato", null);
        System.out.println("\nPintura 1");
        pintura1.mostrar();
        System.out.println("\nPintura 2");
        pintura2.mostrar();
        System.out.println("\nb. Mostrar el artista con más experiencia de ambas pinturas");
        System.out.println("\nPintura 1\nArtista 1\nNombre: " + artista1a.getNombre() + ", Años de experiencia: " + artista1a.getAñosExperiencia());
        System.out.println("Artista 2\n" + "Nombre: " + artista1b.getNombre() + ", Años de experiencia: " + artista1b.getAñosExperiencia());
        System.out.println("\nPintura 2\nArtista 1\nNombre: " + artista2a.getNombre() + ", Años de experiencia: " + artista2a.getAñosExperiencia());
        System.out.println("Artista 2\n" + "Nombre: " + artista2b.getNombre() + ", Años de experiencia: " + artista2b.getAñosExperiencia());
        Artista top1 = pintura1.getArtistaMasExperimentado();
        Artista top2 = pintura2.getArtistaMasExperimentado();
        System.out.println("\nEl artista más experimentado en pintura 1 es: " + top1.getNombre() + " con " + top1.getAñosExperiencia() + " años");
        System.out.println("El artista más experimentado en pintura 2 es: " + top2.getNombre() + " con " + top2.getAñosExperiencia() + " años");
        Artista topGlobal = (top1.getAñosExperiencia() > top2.getAñosExperiencia()) ? top1 : top2;
        System.out.println("\nEl artista con más experiencia de ambas pinturas es: " + topGlobal.getNombre() + " con " + topGlobal.getAñosExperiencia() + " años");
        System.out.println("\nc. Agregar anuncio a pintura2 y calcular monto total\n");
        Anuncio anuncio2 = new Anuncio(102, 4000);
        anuncio2.mostrar();
        pintura2.agregarAnuncio(anuncio2);
        System.out.println("\nPintura 2");
        pintura2.mostrar();
        double totalVenta = pintura1.getPrecioVenta() + pintura2.getPrecioVenta();
        System.out.println("\nPrecio de la Pintura 1\n" + pintura1.getPrecioVenta());
        System.out.println("Precio de la Pintura 2\n" + pintura2.getPrecioVenta());
        System.out.println("\nPrecio total de venta de ambas pinturas: " + totalVenta);
    }
}
