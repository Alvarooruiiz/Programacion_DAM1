package Embarcaciones;

public class Acorazado extends Barco {

    private static int contador;
    private int numCanones;

    static {
        contador = 0;
    }

    public Acorazado(int longitud, int numCanones) {
        super("Ac-" + contador++, longitud);
        this.numCanones = numCanones;
    }

    @Override
    public String toString() {
        String s = super.toString() + " Número de cañones: " + numCanones;

        return s;
    }

}
