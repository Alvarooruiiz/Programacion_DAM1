package ActApl_MarcaPaginas_7_12;


public class MarcaPaginas {
    private int paginaActual;
    
    public MarcaPaginas(int paginaActual){
        this.paginaActual = paginaActual;
    }
    
    public void incrementarPagina(int numPaginas){
        this.paginaActual+=numPaginas;
    }
    
    @Override
    public String toString(){
        String cadena = "";
        cadena = "La ultima pagina leida es: " + this.paginaActual;
        
        return cadena;
    }
    
    public void relectura(){
        this.paginaActual=0;
    }
    
}
