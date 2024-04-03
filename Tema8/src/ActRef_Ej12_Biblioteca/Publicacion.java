package ActRef_Ej12_Biblioteca;


public class Publicacion {
    String isbn;
    String titulo;
    int anoPublic;
    
    public Publicacion(String isbn, String titulo, int anoPublic){
        this.isbn=isbn;
        this.titulo=titulo;
        this.anoPublic=anoPublic;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublic() {
        return anoPublic;
    }

    @Override
    public String toString(){
        return "Isbn: " + this.getIsbn() + ", titulo: " + this.getTitulo() + "año de publicacion: " + this.getAnoPublic();
    }
}
