package ActRes_11_1_LeerObjeto;

import java.io.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tema11 {

    public static void main(String[] args) {
        int[] tabla = {1,2,3,4,5};
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datos.dat"))){
            out.writeObject(tabla);
        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Tema11.class.getName()).log(Level.SEVERE, null, ex);
        }
        tabla=null;

        try ( ObjectInputStream in = new ObjectInputStream(new FileInputStream("datos.dat"))) {
            tabla = (int[]) in.readObject();
            System.out.println(Arrays.toString(tabla));

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
