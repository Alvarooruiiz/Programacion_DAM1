package ActApl_12_25_ListaSocios;

import java.io.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        int opcion;
        Club c1 = new Club();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        try ( ObjectInputStream in = new ObjectInputStream(new FileInputStream("club.dat"))) {
            c1 = (Club) (in.readObject());
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        do {
            System.out.println("Club");
            System.out.println("1- Dar de alta");
            System.out.println("2- Dar de baja");
            System.out.println("3- Editar un socio");
            System.out.println("4- Mostrar socios");
            System.out.println("5- Mostrar por antiguedad");
            System.out.println("6- Mostrar socios anteriores a una fecha");
            System.out.println("7- Salir");
            System.out.println("introduzca la opcion");
            opcion = sc1.nextInt();
            switch (opcion) {
                case 1 -> {

                    System.out.println("Introduzca el apodo");
                    String apodo = sc.nextLine();
                    System.out.println("Introduzca el nombre");
                    String nombre = sc.nextLine();
                    System.out.println("Introduzca la fecha de ingreso");
                    String fecha = sc.nextLine();
                    Socio s = new Socio(apodo, nombre, fecha);
                    c1.anadirSocio(s);

                    
                }

                case 2 -> {
                    System.out.println("Introduzca el apodo del socio a eliminar");
                    String apodo = sc.nextLine();
                    c1.eliminarSocio(apodo);
                }
                case 3 -> {
                    System.out.println("Introduzca el apodo del socio a editar");
                    String clave = sc.nextLine();

                    if (c1.esta(clave)) {
                        System.out.println("Introduzca el apodo");
                        String apodo=sc.nextLine();
                        System.out.println("Introduzca el nombre");
                        String nombre = sc.nextLine();
                        System.out.println("Introduzca la fecha de ingreso");
                        String fecha = sc.nextLine();
                        Socio s = new Socio(apodo, nombre, fecha);
                        c1.modificarSocio(clave, s);
                    }
                }
                case 4 -> {
                    c1.ordenarPorApodos();
                }
                case 5 -> {
                    c1.ordenarPorAntiguedad();
                }
                case 6 -> {
                    System.out.println("Introduzca la fecha");
                    String fec = sc.nextLine();
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate fecha = LocalDate.parse(fec,formato);
                    c1.mostrarAnteriorFecha(fecha);
                }
                case 7->{
                    System.out.println("Gracias");
                }
                default ->
                    System.out.println("El numero introducido no es correcto");
            }
        } while (opcion != 7);
        try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("club.dat"))) {
            out.writeObject(c1);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
