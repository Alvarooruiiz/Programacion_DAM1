package EjercicioBarcos;

public class Acorazado extends Barco{
    
    private static int cont;
    private int numCan;
    public Acorazado(int longitud, int numCan) {
        super("Ac-" + cont, longitud);
        this.numCan= numCan;
        cont ++;
    }

    public int getNumCan() {
        return numCan;
    }

    public void setNumCan(int numCan) {
        this.numCan = numCan;
    }

    @Override
    public String toString() {
        return super.toString() + "Acorazado{" + "numCan=" + numCan + '}';
    } 
    
}
