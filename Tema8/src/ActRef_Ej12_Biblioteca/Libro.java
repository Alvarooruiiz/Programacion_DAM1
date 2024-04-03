package ActRef_Ej12_Biblioteca;

public class Libro extends Publicacion {

    boolean prestado = false;

    public Libro(String isbn, String titulo, int anoPublic) {
        super(isbn, titulo, anoPublic);
    }

    public boolean estaPrestado() {
        return this.prestado;
    }

    public void presta() {
        if (this.prestado) {
            System.out.println("Lo siento, ese libro ya está prestado.");
        } else {
            this.prestado = true;
        }
    }

    public void devuelve() {
        this.prestado = false;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + (this.prestado ? "prestado" : "no prestado") + ")";
    }
}
