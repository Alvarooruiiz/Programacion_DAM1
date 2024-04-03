package aplicacion;

import Coleccion.Flota;
import Embarcaciones.Acorazado;
import Embarcaciones.Barco;
import Embarcaciones.Submarino;
import java.io.*;
import java.util.Arrays;

public class AplicacionExamen {

    public static int menu() {
        int opcion = 0;

        do {
            System.out.println("\n\n -- MENU --");
            System.out.println("1 - Insertar barco");
            System.out.println("2 - Eliminar barco");
            System.out.println("3 - Mostrar acorazados ordenados por orden de insercion");
            System.out.println("4 - Guardar en fichero");
            System.out.println("5 - Leer fichero");
            System.out.println("0 - Salir");
            opcion = EntradaTeclado.pedirEntero("Introduzca la opcion deseada: ");
        } while ((opcion < 0) || (opcion > 5));

        return opcion;
    }

    public static Barco leerBarco() {
        Barco b = null;
        int nCañones = 0;
        char tipoBarco;
        int longitud = EntradaTeclado.pedirEntero("Introduzca la longitud: ");
        do {
            tipoBarco = EntradaTeclado.pedirCadena("Es una acorazado o un submarino(A-S)").toLowerCase().charAt(0);
        } while ((tipoBarco != 'a') && (tipoBarco != 's'));

        if (tipoBarco == 'a') {
            nCañones = EntradaTeclado.pedirEntero("Introduzca el numero de canones: ");
            b = new Acorazado(longitud, nCañones);
        } else {
            b = new Submarino(longitud);
        }

        return b;
    }

    public static void mostrarAcorazados(Barco[] b) {
        for (int i = 0; i < b.length; i++) {
            if (b[i] != null && b[i] instanceof Acorazado) {
                System.out.print(b[i].toString());
            }
        }
    }

    public static void mostrarBarcos(Barco[] b) {
        for (int i = 0; i < b.length; i++) {
            if (b[i] != null) {
                System.out.print(b[i].toString());
            }
        }
    }

    public static void main(String[] args) {
        Flota f = new Flota();
        

        int opcion;

        do {
            opcion = menu();

            switch (opcion) {
                case 1 -> {
                    Barco b = leerBarco();
                    if (f.insertarBarco(b)) {
                        System.out.println("El barco ha sido introducido correctamente");
                    } else {
                        System.out.println("El barco no ha podido ser introducido en la flota");
                    }
                }
                case 2 -> {
                    Barco b = leerBarco();
                    if (f.eliminarBarco(b)) {
                        System.out.println("El barco ha sido eliminado correctamente");
                    } else {
                        System.out.println("El barco no ha podido ser eliminado de la flota");
                    }
                }
                case 3 -> {
                    Barco[] copia = f.arrayBarcos();
                    mostrarBarcos(copia);
                }
                case 4 -> {
                    f.guardarFichero();
                }
                case 5 -> {
                    f.leerFichero();
                }
            }
        } while (opcion != 0);

    }
}
