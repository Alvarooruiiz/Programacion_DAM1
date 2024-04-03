package examendual_t7_88;

public class Imagen extends Componentes{
    
    private int num = (int) (Math.floor(Math.random()*(60-31+1)+31));
    
    public Imagen(String codigo, int ancho, int largo) {
        super(codigo, ancho, largo);
        
        this.setCodigo("I"+num);
    }

    @Override
    public String toString() {
        return "Imagen{" + "num=" + num + '}';
    }
    
    
}
