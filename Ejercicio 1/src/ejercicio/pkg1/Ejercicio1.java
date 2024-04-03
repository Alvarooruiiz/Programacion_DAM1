package ejercicio.pkg1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc;
        String aux;
        String resultado="";
        String[] separador;
        
        try(BufferedReader in = new BufferedReader(new FileReader("entrada.txt"))){
            String linea=in.readLine();
            while(linea!=null){
                sc=new Scanner(linea);
                aux=sc.nextLine();
                separador=aux.split(" ");
                Arrays.sort(separador,String.CASE_INSENSITIVE_ORDER);
                for (String separador1 : separador) {
                    resultado += separador1 + " ";
                }
                resultado+="\n";
                linea=in.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
            
        System.out.println(resultado);    
            
            
        try ( BufferedWriter out = new BufferedWriter(new FileWriter("salida.txt"))) {
            out.write(resultado);
            out.newLine();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
    

        
