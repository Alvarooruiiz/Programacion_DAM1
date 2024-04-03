package ActApl_10_13_LeerListaNumeros;

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class LeerListaNumeros {

    public static void main(String[] args) {
        Scanner sc;
        String aux = "";

        try (BufferedReader in1 = new BufferedReader(new FileReader("Datos1.txt"));BufferedReader in2= new BufferedReader(new FileReader("Datos2.txt"));BufferedWriter out = new BufferedWriter(new FileWriter("Datos3.txt"))) {
            String linea = in1.readLine();
            while (linea != null) {
                sc= new Scanner(linea);
                aux += sc.nextLine()+",";
                linea=in1.readLine();
            }
            String linea2 = in2.readLine();
            while (linea2 != null) {
                sc= new Scanner(linea2);
                aux +=sc.nextLine() + ",";
                linea2=in2.readLine();
            }
            
            String[] lista = aux.split(",");
            
            int listaAux[]=parseInt(lista);
            Arrays.sort(listaAux);

            lista=convertirString(listaAux);
            System.out.println(Arrays.toString(lista));
            
            for (String lista1 : lista) {
                out.write(lista1);
                out.newLine();
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("No se ha encontrado el fichero");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static int[] parseInt(String[] l){
        int[] lista = new int[l.length];
         for(int i=0; i<lista.length; i++) {
         lista[i] = Integer.parseInt(l[i]);
      }
         return lista;
    }
    
    public static String[] convertirString(int[] l){
        String[] lista = new String[l.length];
        for(int i=0; i<l.length;i++){
            lista[i]=String.valueOf(l[i]);
        }
        return lista;
    }
}

