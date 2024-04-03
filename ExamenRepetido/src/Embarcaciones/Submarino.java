package Embarcaciones;

public class Submarino extends Barco {

    private static int contador;
    private double longitudPeriscopio;

    static {
        contador = 0;
    }

    public Submarino(int longitud) {
        super("Sub-" + contador++, longitud);
        this.longitudPeriscopio = (double) this.getLongitud() / 10;
    }

    @Override
    public String toString() {
        String s = super.toString() + " Longitud del periscopio: " + longitudPeriscopio;
        return s;
    }
}
