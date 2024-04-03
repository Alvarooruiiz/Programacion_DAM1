package Embarcaciones;

public class Acorazado extends Barco{
    
    public static int contAcor;
    private int numCaniones;

    public Acorazado(int longitud, int numCaniones) {
        super("Ac-"+contAcor++, longitud);
        this.numCaniones=numCaniones;
    }

    public int getNumCaniones() {
        return numCaniones;
    }

    public void setNumCaniones(int numCaniones) {
        this.numCaniones = numCaniones;
    }

    @Override
    public String toString() {
        String cadena=super.toString();
        cadena+="Acorazado{" + "numCaniones=" + numCaniones + '}';
        return cadena;
    }
    
    
}
