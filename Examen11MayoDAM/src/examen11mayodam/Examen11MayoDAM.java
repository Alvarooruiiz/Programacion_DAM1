package examen11mayodam;

import Alumno.*;
import GrupoAlumnado.GrupoAlumnado;
import NotaAlumnado.*;
import java.util.Iterator;
import java.util.Scanner;

public class Examen11MayoDAM {

    public static Scanner sc = new Scanner(System.in);

    public static int menu() {

        int opcion = 0;

        do {
            System.out.println(" -- MENU --");
            System.out.println("1. Introducir alumnado");
            System.out.println("2. Eliminar alumnado");
            System.out.println("3. Introducir nota de alumno/a");
            System.out.println("4. Mostrar información (sin notas) de todos los alumnos del grupo");
            System.out.println("5. Mostrar todas las notas de un alumno");
            System.out.println("6. Mostrar el nombre de todos los alumnos NEAE con alguna nota");
            System.out.println("0. Salir");
            opcion = EntradaTeclado.pedirEntero("Introduzca una opcion: ");
        } while ((opcion < 0) || (opcion > 6));

        return opcion;
    }

    public static void main(String[] args) {

        int opcion;
        Double coeficiente = null;
        GrupoAlumnado ga = new GrupoAlumnado();

        do {
            opcion = menu();

            switch (opcion) {
                case 1 -> {
                    String respuesta = EntradaTeclado.pedirCadena("El alumno tiene NEAE (Si - No): ");
                    if (respuesta.equalsIgnoreCase("si")) {
                        String nombre = EntradaTeclado.pedirCadena("Introduzca el nombre: ");
                        coeficiente = EntradaTeclado.pedirDouble("Introduzca el coeficiente que tiene de NEAE (1.0-2.0): ");
                        AlumnadoNEAE al = new AlumnadoNEAE(nombre, coeficiente);

                        if (ga.inscribirAlumnado(al)) {
                            System.out.println("El alumno ha sido introducido correctamente");
                        } else {
                            System.out.println("El alumno no se ha podido introducir");
                        }
                    } else if (respuesta.equalsIgnoreCase("no")) {
                        String nombre = EntradaTeclado.pedirCadena("Introduzca el nombre: ");
                        Alumnado al = new Alumnado(nombre);

                        if (ga.inscribirAlumnado(al)) {
                            System.out.println("El alumno ha sido introducido correctamente");
                        } else {
                            System.out.println("El alumno no se ha podido introducir");
                        }
                    }
                }
                case 2 -> {
                    int nie = EntradaTeclado.pedirEntero("Introduzca el nie del alumno a eliminar: ");
                    if (ga.eliminarAlumnado(ga.encontrarPorNie(nie))) {
                        System.out.println("El alumno se ha eliminado correctamente");
                    } else {
                        System.out.println("El NIE del alumno introduido no se ha encontrado");
                    }
                }
                case 3 -> {
                    int nie = EntradaTeclado.pedirEntero("Introduzca el el nie del alumno: ");
                    String fecha = EntradaTeclado.pedirCadena("Introduzca la fecha de la nota (dd-mm-yyyy): ");
                    double n = EntradaTeclado.pedirDouble("Introduzca el valor de la nota: ");
                    Alumnado al = ga.encontrarPorNie(nie);

                    if (al != null) {
                        if (al instanceof AlumnadoNEAE) {
                            //n=((AlumnadoNEAE) al).calculoNota(n);
                            n*=coeficiente;
                            NotaAlumnado nota = new NotaAlumnado(fecha, n);
                            NotaAlumnado.introducirNota(nie, nota);
                        }else{
                            NotaAlumnado nota = new NotaAlumnado(fecha, n);
                        NotaAlumnado.introducirNota(nie, nota);
                        }
                        
                    } else {
                        System.out.println("El alumno no se ha podido encontrar");
                    }

                }
                case 4 -> {
                    System.out.println(ga);
                }
                case 5 -> {
                    int nie = EntradaTeclado.pedirEntero("Introduzca el NIE de la persona de la que desea conocer las notas: ");
                    Alumnado al = ga.encontrarPorNie(nie);
                    if (al != null) {
                        NotaAlumnado.notasAlumnado(nie);
                    } else {
                        System.out.println("El alumno no pertenece al grupo");
                    }
                }
                case 6 -> {
                    System.out.println("Alumnos con NAEA con alguna nota");
//                    NotaAlumnado.notasAlumnado()
                }
            }

        } while (opcion != 0);

    }
}
