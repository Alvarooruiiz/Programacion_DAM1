package ActApl_10_12_NombreEdad;

import java.io.*;
import java.util.Scanner;

public class NombreEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.println("Introduzca su nombre");
        nombre=sc.nextLine();
        System.out.println("\nIntroduzca su edad");
        edad=sc.nextInt();
        
        String cadena = "Nombre: " + nombre+ ", Edad:" + edad;
        
        try(BufferedWriter out = new BufferedWriter(new FileWriter("datos.txt", true))){
            out.write(cadena);
            out.newLine();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
