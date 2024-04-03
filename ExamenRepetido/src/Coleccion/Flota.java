package Coleccion;

import Embarcaciones.Barco;
import java.io.*;

public class Flota {

    private Barco[] flota;
    private int barcosEnFlota;

    public Flota() {
        this.flota = new Barco[(int) (Math.random() * 11) + 10];
        barcosEnFlota = 0;
    }

    public int numeroElementos() {
        return barcosEnFlota;
    }

    private boolean flotaLlena() {
        return (this.flota.length == barcosEnFlota);
    }

    private int buscarBarco(Barco b) {
        int pos = -1;
        for (int i = 0; (i < barcosEnFlota) && (pos == -1); i++) {
            pos = this.flota[i].getLongitud() == b.getLongitud() ? i : -1;
        }
        return (pos);
    }

    public boolean insertarBarco(Barco b) {
        boolean insertado = false;
        if ((!flotaLlena()) && (buscarBarco(b) == -1)) {
            this.flota[barcosEnFlota++] = b;
            insertado = true;
        }
        return insertado;
    }

    public boolean eliminarBarco(Barco b) {
        boolean eliminado = false;
        int pos = buscarBarco(b);
        if (pos != -1) {
            for (int i = pos; i < this.barcosEnFlota - 1; i++) {
                this.flota[i] = this.flota[i + 1];
                this.flota[i] = null;
            }
            eliminado = true;
            this.barcosEnFlota--;
        }
        return eliminado;
    }



    public Barco[] arrayBarcos() {
        Barco[] array = new Barco[flota.length];
        System.arraycopy(flota, 0, array, 0, flota.length);
        return array;
    }

    @Override
    public String toString() {
        String s = "----Flota----";
        for (int i = 0; i < barcosEnFlota; i++) {
            s += flota[i].toString();
        }
        s += "\nbarcosEnFlota=" + barcosEnFlota;
        return s;
    }
}
