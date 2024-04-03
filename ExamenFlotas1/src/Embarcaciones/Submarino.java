package Embarcaciones;

public class Submarino extends Barco {

    private static int n=1;

    public Submarino(int longitud) {
        super("Sub-" + n, longitud);
        n++;
    }
    
    public double mPeriscopio(){
        double r=(double) this.getLongitud()/10;
        return r;
    }

    @Override
    public String toString() {
        return "Submarino: "+ super.toString() + " longitud del periscopio " + mPeriscopio();
    }
    
    
}
