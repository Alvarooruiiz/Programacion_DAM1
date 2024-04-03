package ActRef_Ej12_Biblioteca;

public class Revista extends Publicacion{
    int numero;
    
    public Revista(String isbn, String titulo, int anoPublic, int numero) {
        super(isbn, titulo, anoPublic);
        this.numero=numero;
    }

    public int getNumero() {
        return numero;
    }  
}
