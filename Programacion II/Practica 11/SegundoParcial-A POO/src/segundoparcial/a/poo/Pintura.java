package segundoparcial.a.poo;
public class Pintura extends Obra {
    private String genero;
    public Pintura(String titulo, String material, Artista a1, Artista a2, String genero, Anuncio anuncio) {
        super(titulo, material, a1, a2, anuncio);
        this.genero = genero;
    }
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Género: " + genero);
    }
}
