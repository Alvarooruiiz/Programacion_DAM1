package aplicacion;

import Coleccion.Flota;
import Embarcaciones.Acorazado;
import Embarcaciones.Barco;
import Embarcaciones.Submarino;



public class AplicacionExamen {

    public static int menu() {
        int opcion = 0;

        do {
            System.out.println("\n\n -- MENU --");
            System.out.println("1 - Insertar barco");
            System.out.println("2 - Eliminar barco");
            System.out.println("3 - Mostrar acorazados ordenados por orden de insercion");
            System.out.println("0 - Salir");
            opcion = EntradaTeclado.pedirEntero("Introduzca la opcion deseada: ");
        } while ((opcion < 0) || (opcion > 3));

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



    public static void main(String[] args) {

        int opcion = 0;
        
        Flota fl = new Flota();

        do {
            opcion = menu();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduzca el nuevo barco");
                    
                    Barco b=leerBarco();
                    fl.insertarBarco(b);
                }
                case 2 -> {
                    Barco b=leerBarco();
                    fl.eliminarBarco(b);
                }

                case 3 -> {
                    fl.mostrarAcorazado();
                }

            }
        } while (opcion != 0);
    }
}
