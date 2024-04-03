package ActApl_10_14_LeerContarPalabrasLetrasLinea;

import java.io.*;
import java.util.Scanner;


public class LeerLetrasPalabrasLineas {
    public static void main(String[] args) {
        String texto="";
        Scanner sc;
        int nPalabras=0, nLineas=0;
        
        try(BufferedReader in = new BufferedReader(new FileReader("Carta.txt"))){
            String linea=in.readLine();
            while(linea!=null){
                sc = new Scanner(linea);
                texto+=sc.nextLine();
                linea=in.readLine();
                
                nPalabras=contarPalabras(texto);
                
                nLineas++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el fichero");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Numero de letras: " + texto.length());
        System.out.println("Numero de palabras: " + nPalabras);
        System.out.println("Numero de lineas: " + nLineas);
    }
    
    public static int contarPalabras(String texto){
        return texto.split("\\s+|\n").length;
    }
}
