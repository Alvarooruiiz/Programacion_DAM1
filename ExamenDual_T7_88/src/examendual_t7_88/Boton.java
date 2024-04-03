package examendual_t7_88;

public class Boton extends Componentes{
    private int num;
    
    public Boton(int ancho, int largo) {
        super("B"+ num, ancho, largo);
         num = (int) (Math.floor(Math.random()*(30-1+1)+1));
        
    }

    @Override
    public String toString() {
        return "Boton{" + "num=" + num + '}';
    }
    
    
}
