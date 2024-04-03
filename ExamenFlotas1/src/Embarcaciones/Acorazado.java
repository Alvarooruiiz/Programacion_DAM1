package Embarcaciones;

public class Acorazado extends Barco implements java.io.Serializable{
    private static int n=1;
    private int nCanones;
    
    public Acorazado(int longitud, int nCanones) {
        super("Ac-" + n, longitud);
        this.nCanones=nCanones;
        n++;
    }   

    public int getnCanones() {
        return nCanones;
    }

    public void setnCanones(int nCanones) {
        this.nCanones = nCanones;
    }

    @Override
    public String toString() {
        return super.toString()+ ", nCanones: " + nCanones + '}';
    }
    
    
}
