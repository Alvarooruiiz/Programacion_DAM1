package examen;

public class Jefe extends Personaje {
    public static int contadorJefes;
    private int vidaExtra;

    
    public Jefe() {
        super(Integer.parseInt("2"+contadorJefes++), 15);
        this.vidaExtra =super.getCodigo() /2;
    }

    public int getVidaExtra() {
        return vidaExtra;
    }

    public void setVidaExtra(int vidaExtra) {
        this.vidaExtra = vidaExtra;
    }
    
    @Override
    public String toString() {
        String cadena = super.toString();
        cadena+= "Jefe{" + "vidaExtra=" + vidaExtra + '}';
        return cadena;
    }
}

// En general se cambia lo mismo que en la clase Guerrero
// super.getCodigo se refiere al get de la clase padre Personaje
// Añadir los getter y setters de la vidaExtra
// El toString para sobreescribir el toString de la clase padre, añades a la cadena el toString de la clase padre.