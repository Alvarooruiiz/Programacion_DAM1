

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class prueba {
   public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException {
        Club club = new Club();
//        File file = new File("club.dat");
//        if (file.exists()) {
//            FileInputStream fis = new FileInputStream(file);
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            club.socios = (HashMap<String,Socio>)ois.readObject();
//            ois.close();
//            fis.close();
//        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Alta socio.");
            System.out.println("2. Baja socio.");
            System.out.println("3. Modificación socio.");
            System.out.println("4. Listar socios por apodo.");
            System.out.println("5. Listar socios por antigüedad.");
            System.out.println("6. Listar los socios con alta anterior a un año determinado.");
            System.out.println("7. Salir.");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Apodo: ");
                    String apodoAlta = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombreAlta = scanner.nextLine();
                    System.out.print("Fecha de ingreso (dd/mm/yyyy): ");
                    String fechaAltaString = scanner.nextLine();
                    SimpleDateFormat sdfAlta = new SimpleDateFormat("dd/MM/yyyy");
                    Date fechaAlta = sdfAlta.parse(fechaAltaString);
                    club.altaSocio(apodoAlta, nombreAlta, fechaAlta);
                }
                case 2 -> {
                    System.out.print("Apodo: ");
                    String apodoBaja = scanner.nextLine();
                    club.bajaSocio(apodoBaja);
                }
                case 3->{
                    System.out.print("Apodo:");
                    String apodo = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Fecha de ingreso (dd/mm/yyyy): ");
                    String fechaIngreso = scanner.nextLine();
                    SimpleDateFormat sdfAlta = new SimpleDateFormat("dd/MM/yyyy");
                    Date fechaAlta = sdfAlta.parse(fechaIngreso);
                    club.modificarSocio(apodo, nombre, fechaAlta);
                }
                case 4->{
                    club.listarSociosPorApodo();
                }
                case 5->{
                    club.listarSociosPorAntiguedad();  
                }
                case 6->{
                     
                }
            }
        }
   }
}
