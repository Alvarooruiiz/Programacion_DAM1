package ActProp_10_14_NumerosReales;

import java.io.*;

public class NumerosReales{
    public static void main(String[] args) {
        BufferedReader in = null;
        
        try{
            in = new BufferedReader(new FileReader("NumeroReales.txt"));
            String texto = in.readLine();
            String cadena[]= texto.split(" ");
            double suma=0;
            for (String cadena1 : cadena) {
                suma += Double.valueOf(cadena1);
            }
            
            System.out.println("SUMA: " + suma + " MEDIA: " + suma/cadena.length);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }finally{
            if(in != null){
                try{
                    in.close();
                } catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
