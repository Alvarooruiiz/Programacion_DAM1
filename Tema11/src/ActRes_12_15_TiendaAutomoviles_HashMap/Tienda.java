/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActRes_12_15_TiendaAutomoviles_HashMap;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alvar
 */
public class Tienda {

    public static void main(String[] args) {
        TreeMap<String, Integer> tienda = new TreeMap<>();

        try ( ObjectInputStream in = new ObjectInputStream(new FileInputStream("TiendaAutomoviles.dat"))) {
            tienda = (TreeMap<String, Integer>) in.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        do {
            System.out.println("1.Alta producto");
            System.out.println("2.Baja producto");
            System.out.println("3.Cambio stock de producto");
            System.out.println("4.Listar existencias");
            System.out.println("5.Salir");
            System.out.print("\nIntroducir opción: ");
            opcion=sc.nextInt();
            
            
            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduzca el codigo alfanumerico");
                    String codigo=sc2.nextLine();
                    System.out.println("Introduzca el stock de vehiculos");
                    int numCoches=sc.nextInt();
                    
                    tienda.put(codigo, numCoches);
                }
                case 2 -> {
                    System.out.println("Introduzca el codigo de los vehiculos a eliminar");
                    String codigo=sc2.nextLine();
                    tienda.remove(codigo);
                }
                case 3 -> {
                    System.out.println("Introduzca el codigo de los vehiculos a los que se les modificara el stock");
                    String codigo=sc2.nextLine();
                    System.out.println("Introduzca el nuevo stock");
                    int stock=sc.nextInt();
                    tienda.put(codigo, stock);
                }
                case 4 -> {
                    System.out.println(tienda);
                }
                default ->
                    System.out.println("Numero incorrecto");
            }
        } while ((opcion != 5));

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("TiendaAutomoviles.dat"))){
            out.writeObject(tienda);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
