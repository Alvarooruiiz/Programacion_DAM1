package ActReArray_Ej3_Discos;

import java.util.Arrays;

public class Disco {

    String codigo;
    String autor;
    String titulo;
    String genero;
    int duracion;

    public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public static Disco[] ampliarTamaño(Disco d[]) {
        Disco dAux[] = Arrays.copyOf(d, d.length + 1);
        return dAux;
    }

    public static Disco[] eliminarConjunto(Disco d[], int x) {
        Disco dAux[] = new Disco[d.length - 1];
        System.arraycopy(d, 0, dAux, 0, x);
        if (d.length != x) {
            System.arraycopy(d, x + 1, dAux, x, d.length - x - 1);
        }
        return dAux;
    }


    @Override
    public String toString() {
        return "Código: " + this.getCodigo() + "\nAutor: " + this.getAutor() + "\nTitulo: " + this.getTitulo() + "\nGenero: " + this.getGenero() + "\nDuracion: " + this.getDuracion() + "\n===================\n";
    }
}
