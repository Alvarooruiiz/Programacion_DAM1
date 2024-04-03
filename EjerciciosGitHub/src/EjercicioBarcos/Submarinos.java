package EjercicioBarcos;

public class Submarinos extends Barco{
    
    private static int cont;
    public Submarinos(int longitud) {
        super("Sub-" + cont, longitud);
        cont++;
    }
    
    public double longPersicopio(){
        return (double)this.getLongitud()/10;
    }

    @Override
    public String toString() {
        return super.toString() + "Submarinos{" + "Longitud del persiscopio:" + longPersicopio() + '}';
    }
    
    
}
