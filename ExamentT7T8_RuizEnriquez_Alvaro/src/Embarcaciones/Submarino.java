package Embarcaciones;

public class Submarino extends Barco{

    public static int contSub;
    private int metrosPeriscopio;
    
    public Submarino(int longitud) {
        super("Sub-" + contSub++, longitud);
    }

    public int getMetrosPeriscopio() {
        return metrosPeriscopio;
    }

    public void setMetrosPeriscopio(int metrosPeriscopio) {
        this.metrosPeriscopio = metrosPeriscopio;
    }
    
    public int longitudPeriscopio(){
        int longitud;
        longitud=super.getLongitud()/10;
        
        return longitud;
        
        
    }

    @Override
    public String toString() {
        String cadena=super.toString();
        cadena +="Submarino{" + "metrosPeriscopio=" + metrosPeriscopio + '}';
        return cadena;
    }
}
