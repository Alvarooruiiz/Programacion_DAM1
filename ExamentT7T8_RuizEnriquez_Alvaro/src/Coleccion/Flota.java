package Coleccion;

import Embarcaciones.Acorazado;
import Embarcaciones.Barco;

public class Flota {

    private Barco[] flota;

    public Flota() {
        int tamanio = (int) (Math.floor(Math.random() * (20 - 10 + 1) + 10));
        this.flota = new Barco[tamanio];
    }

    public int numeroElementos() {
        int num = flota.length;
        return num;
    }

    public boolean insertarBarco(Barco b) {
        Barco aux[] = new Barco[flota.length + 1];
        boolean esta = false;
        int i = 0;

        while (b != flota[i] || i < flota.length - 1) {
            for (i = 0; i < flota.length; i++) {
                if (b.getLongitud() == flota[i].getLongitud()) {
                    System.out.println("Ya hay un barco igual en la flota");
                    return false;
                }
            }
        }
        for (int j = 0; i < flota.length; i++) {
            aux[i] = flota[i];
        }
        aux[aux.length] = b;
        flota = aux;
        return true;
    }

   public static Barco[] eliminar(Barco d[], int x) {
        Barco bAux[] = new Barco[d.length - 1];
        System.arraycopy(d, 0, bAux, 0, x);
        if (d.length != x) {
            System.arraycopy(d, x + 1, bAux, x, d.length - x - 1);
        }
        return bAux;
    }

    public boolean eliminarBarco(Barco b) {
        boolean eliminado=false;

        for (int i = 0; i < flota.length; i++) {
            if (b.getCodigo() == flota[i].getCodigo() && b.getLongitud() == flota[i].getLongitud()) {
                eliminar(flota,i);
                eliminado = true;
            }

        }
        return eliminado;
    }

    public Barco[] arrayBarcos() {
        Barco[] aux = flota;

        return aux;
    }
    
    public void mostrarAcorazado(){
        for(int i=0; i<flota.length;i++){
            if(flota[i] instanceof Acorazado){
                flota[i].toString();
            }
        }
    }
}
