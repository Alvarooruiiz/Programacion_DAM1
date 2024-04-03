package EjercicioBarcos;
import java.io.*;
import java.util.ArrayList;
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
        } while ((opcion < 0) || (opcion > 7));

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
            b = new Submarinos(longitud);
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
        Flota f = new Flota(5);
        

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
                    System.out.println(f.numBarcos());
                }
                case 4 -> {
                    System.out.println(f.listadoBarcos());
                }
                case 5 -> {
                    ArrayList<Barco> lista=f.listadoBarcos();
                    lista.sort((s1,s2) -> s2.getLongitud()-(s1.getLongitud()));
                    System.out.println(lista);
                }
                case 6 -> {
                    double num=f.longitudPeriscopioFlota();
                    System.out.println(num);
                }
                case 7 -> {
                    if(f.recibeAtaque()){
                        System.out.println("El ataque se ha realizado con exito");
                    }else System.out.println("No se ha podido realizar el ataque porque la flota ha sido eliminada");
                }
            }
        } while (opcion != 0);

    }
}
