package ActReArray_Ej3_Discos;

import static ActReArray_Ej3_Discos.Disco.*;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n, duracionIntroducido;
        String codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, codigoIntroducidoModi;

        Disco[] coleccion = new Disco[2];
        coleccion[0] = new Disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);
        coleccion[1] = new Disco("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);

        System.out.println("COLECCION DE DISCOS");
        do {
            System.out.println("===================");
            System.out.println("1. Listado \n2. Nuevo disco \n3. Modificar \n4. Borrar \n5. Salir");
            System.out.print("Introduzca su seleccion: ");
            n = sc.nextInt();
            System.out.println("===================");
            switch (n) {
                case 1 -> {
                    System.out.println("1. Codigos \n2. Autores \n3.Titulos \n4.Generos \n5.Duraciones \n6.Discos completos");
                    System.out.println("===================");
                    System.out.print("Introduzca el valor de la seleccion que desea: ");
                    int x=sc.nextInt();
                    System.out.println("===================");
                    
                    switch(x){
                        case 1->{
                            for(int i=0;i<coleccion.length;i++){
                                System.out.println(coleccion[i].getCodigo());
                            } 
                        }
                        case 2->{
                            for(int i=0;i<coleccion.length;i++){
                                System.out.println(coleccion[i].getAutor()); 
                            } 
                        }
                        case 3->{
                            for(int i=0;i<coleccion.length;i++){
                                System.out.println(coleccion[i].getTitulo()); 
                            } 
                        }
                        case 4->{
                            for(int i=0;i<coleccion.length;i++){
                                System.out.println(coleccion[i].getGenero());
                            } 
                        }
                        case 5->{
                            for(int i=0;i<coleccion.length;i++){
                                System.out.println(coleccion[i].getDuracion());
                            } 
                        }
                        case 6->{
                            for(int i=0;i<coleccion.length;i++){
                               System.out.println(coleccion[i]);
                            } 
                        }
                        default->{
                            System.out.println("El valor introducido no corresponde con las selecciones");
                            System.out.println("===================");
                        }
                    }
                    break;
                }
                case 2 -> {
                    boolean aux = false;

                    do {
                        System.out.print("Introduzca el codigo: ");
                        codigoIntroducido = sc.next();
                        System.out.println("===================");
                        int i = 0;
                        while (!aux || i < coleccion.length) {
                            if (coleccion[i].getCodigo().equals(codigoIntroducido)) {
                                aux = true;
                                System.out.println("El codigo introducido ya existe");
                            }else aux=false;
                            i++;
                        }
                    } while (!aux);

                    System.out.print("Introduzca el autor: ");
                    autorIntroducido = sc.next();
                    System.out.print("Introduzca el titulo: ");
                    tituloIntroducido = sc.next();
                    System.out.print("Introduzca el genero: ");
                    generoIntroducido = sc.next();
                    System.out.print("Introduzca el duracion: ");
                    duracionIntroducido = sc.nextInt();
                    coleccion = ampliarTamaño(coleccion);
                    coleccion[coleccion.length - 1] = new Disco(codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducido);
                    break;
                }
                case 3 -> {
                    System.out.print("Introduzca el codigo del disco a modificar: ");
                    codigoIntroducidoModi = sc.next();
                    for (int i = 0; i < coleccion.length; i++) {
                        if (coleccion[i].getCodigo().equals(codigoIntroducidoModi)) {
                            System.out.print("Introduzca el autor: ");
                            autorIntroducido = sc.next();
                            System.out.print("Introduzca el titulo: ");
                            tituloIntroducido = sc.next();
                            System.out.print("Introduzca el genero: ");
                            generoIntroducido = sc.next();
                            System.out.print("Introduzca el duracion: ");
                            duracionIntroducido = sc.nextInt();

                            coleccion[i] = new Disco(codigoIntroducidoModi, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducido);
                            break;
                        } else {
                            System.out.println("El codigo introducido no existe");
                        }
                    }
                    break;
                }
                case 4 -> {
                    System.out.print("Introduzca el codigo del disco a eliminar: ");
                    codigoIntroducidoModi = sc.next();
                    System.out.println("===================");
                    for (int i = 0; i < coleccion.length; i++) {
                        if (coleccion[i].getCodigo().equals(codigoIntroducidoModi)) {
                            coleccion = eliminarConjunto(coleccion, i);
                        } else {
                            System.out.println("El codigo introducido no existe");
                            System.out.println("===================");
                        }
                    }
                    break;
                }
                default ->{
                    System.out.println("El numero introducido no corresponde a ninguna seleccion del menu");
                    System.out.println("===================");
                }
            }
        } while (n != 5);

    }

}
