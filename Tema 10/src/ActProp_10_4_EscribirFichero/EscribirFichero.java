package ActProp_10_4_EscribirFichero;

import java.io.*;
import java.util.Scanner;

public class EscribirFichero {

    public static void main(String[] args) {
        BufferedWriter out = null;
        Scanner sc = new Scanner(System.in);
        String cadena="";

        try {
            out = new BufferedWriter(new FileWriter("Fichero.txt", false));
            do {
                out.write(cadena);
                cadena = sc.nextLine();
                out.newLine();
            }while (!"fin".equalsIgnoreCase(cadena));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
