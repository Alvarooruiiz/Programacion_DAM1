package Coleccion;

import Embarcaciones.Barco;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Flota implements java.io.Serializable {

    private Barco[] flota;
    private int numeroBarcos = 0;

    public Flota() {
        this.flota = new Barco[(int) (Math.random() * 11 + 10)];
        this.numeroBarcos++;
    }

    public int numeroElementos() {
        return this.flota.length;

    }

    public boolean flotaLlena() {
        return (this.flota.length == numeroBarcos);

    }

//    public boolean buscarBarco(Barco b){
//        boolean esta=false;
//        
//        for()
//    }
    public boolean insertarBarco(Barco b) {
        boolean esta = false;
        int i = 0;
        do {
            if (flota[i] != null) {
                if (flota[i].getLongitud() == b.getLongitud()) {
                    esta = true;
                }
            }
            i++;
        } while (!esta && i <= flota.length - 1);

        if (!esta && (!flotaLlena())) {
            this.flota = Arrays.copyOf(flota, flota.length + 1);
            flota[flota.length - 1] = b;
            esta = true;
        }
        return esta;
    }

    public boolean eliminarBarco(Barco b) {
        boolean eliminado = false;
        int i;
        int aux = 0;

        do {
            for (i = 0; i < flota.length; i++) {
                if (flota[i].getLongitud() == b.getLongitud()) {
                    aux = i;
                    eliminado = true;
                }

            }
        } while (!eliminado || i == flota.length);

        for (int z = aux; z < flota.length; z++) {
            flota[i] = flota[i + 1];
        }

        return eliminado;
    }

    public void guardarFichero() {
        try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("flotas.dat"))) {
            out.writeObject(flota);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public void unirFlotas() {

    }

    public void leerFichero() {
        Barco[] fAux = null;
        try ( ObjectInputStream in = new ObjectInputStream(new FileInputStream("flotas.dat"))) {
            fAux = (Barco[]) in.readObject();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(Arrays.toString(fAux));
    }


public Barco[] arrayBarcos() {
        Barco[] array = new Barco[flota.length];
        System.arraycopy(flota, 0, array, 0, flota.length);
        return array;
    }

    
}
