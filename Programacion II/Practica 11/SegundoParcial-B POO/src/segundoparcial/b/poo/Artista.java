package segundoparcial.b.poo;
public class Artista {
    private String nombre;
    private String ci;
    private int añosExperiencia;
    public Artista(String nombre, String ci, int añosExperiencia) {
        this.nombre = nombre;
        this.ci = ci;
        this.añosExperiencia = añosExperiencia;
    }
    public int getAñosExperiencia() {
        return añosExperiencia;
    }
    public String getNombre() {
        return nombre;
    }
    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", CI: " + ci + ", Años de experiencia: " + añosExperiencia);
    }
}
