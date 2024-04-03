package ActRes_10_8_CopiaFichero;

import java.io.*;
import java.util.Scanner;

public class CopiaDeFicheroExistente {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Scanner s;
        System.out.println("Introduzca el nombre del fichero");
        String nombreFichero=sc.nextLine();
        
        try(BufferedReader in= new BufferedReader(new FileReader(nombreFichero));BufferedWriter out = new BufferedWriter(new FileWriter("Copia_"+nombreFichero))){
            String linea = in.readLine();
            while(linea!=null){
                s=new Scanner(linea);
                out.write(linea);
                out.newLine();
                linea=in.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}