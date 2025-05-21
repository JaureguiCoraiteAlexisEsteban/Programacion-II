package segundoparcial.a.poo;
public class Obra {
    protected String titulo;
    protected String material;
    protected Artista a1;
    protected Artista a2;
    protected Anuncio anuncio;
    public Obra(String titulo, String material, Artista a1, Artista a2, Anuncio anuncio) {
        this.titulo = titulo;
        this.material = material;
        this.a1 = a1;
        this.a2 = a2;
        this.anuncio = anuncio;
    }
    public Artista getArtistaMasExperimentado() {
        return (a1.getAñosExperiencia() > a2.getAñosExperiencia()) ? a1 : a2;
    }
    public void agregarAnuncio(Anuncio anuncio) {
        this.anuncio = anuncio;
    }
    public double getPrecioVenta() {
        return (anuncio != null) ? anuncio.getPrecio() : 0;
    }
    public void mostrar() {
        System.out.println("\nTítulo: " + titulo);
        System.out.println("Material: " + material);
        a1.mostrar();
        a2.mostrar();
        if (anuncio != null) {
            anuncio.mostrar();
        } else {
            System.out.println("Sin anuncio.");
        }
    }
}
