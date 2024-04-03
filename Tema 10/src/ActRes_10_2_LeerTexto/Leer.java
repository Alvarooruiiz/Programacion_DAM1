package ActRes_10_2_LeerTexto;

import java.io.*;

public class Leer {
    public static void main(String[] args) throws IOException {
        String texto="";
        FileReader in = null;
        int c;
        
        try {
            in = new FileReader("fichero.txt");
            c= in.read();
            while(c!=-1){
                texto +=(char)c;
                c= in.read();
            }
        } catch (FileNotFoundException e){
            System.out.println("No se encontró el fichero");
        }finally{
            if(in !=null){
                try{
                    in.close();
                }catch (IOException ex){
                    System.out.println(ex.getMessage());
                }
            }
        }
        System.out.println(texto);
    }
}
