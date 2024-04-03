package ActApl_10_16;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class LibroFirmas {

    public static void main(String[] args) {
        String texto = "";
        String[] tabla = new String[4];
        Scanner sc;
        int i=0;
        
        System.out.println("Introduzca 0 si desea leer las firmas y 1 si desea introducir una nueva");
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);

        switch (num) {
            case 0 -> {
                try ( BufferedReader in = new BufferedReader(new FileReader("firma.txt"))) {
                    String linea = in.readLine();
                    while (linea != null) {
                        sc = new Scanner(linea);
                        texto += sc.nextLine() + "\n";
                        linea = in.readLine();
                        tabla[i]=linea;
                        i++;
                    }
                } catch (FileNotFoundException ex) {
                    System.out.println(ex.getMessage());
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                System.out.println(texto);
            }
            case 1 -> {
                try ( BufferedWriter out = new BufferedWriter(new FileWriter("firma.txt", true))) {
                    System.out.print("Introduzca la nueva firma: ");
                    String firma = sc2.nextLine();
                    if(anadirArray(tabla,firma)==false){
                        out.write(firma);
                        System.out.println("esa firma no está");
                    out.newLine();
                    }else{
                        System.out.println("Esa firma ya existe");
                    }
                    
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    public static boolean anadirArray(String[] t, String nuevo) {
        boolean esta = false;
        for (int i = 0; i < t.length; i++) {
            if (nuevo.equals(t[i])) {
                esta = true;
            }
        }
        if (esta == false) {
            t = Arrays.copyOf(t, t.length + 1);
            t[t.length - 1] = nuevo;
        }
        return esta;
    }

}
