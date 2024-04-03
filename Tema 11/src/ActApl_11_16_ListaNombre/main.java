package ActApl_11_16_ListaNombre;

import java.io.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void anadirNombre(Lista[] t, Lista nuevo) {
        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = nuevo;
    }

    public static void main(String[] args) {
        Lista[] l = new Lista[0];
        Scanner sc = new Scanner(System.in);

            try ( ObjectInputStream in = new ObjectInputStream(new FileInputStream("lista.dat"))) {
            l = (Lista[]) in.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException | IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(Arrays.toString(l));
        String cadena;

        do {
            System.out.println("Introduzca el nombre a introducir en la lista");
            cadena = sc.nextLine();

            if (!"fin".equals(cadena)) {
                Lista nuevo = new Lista(cadena);
                l = Arrays.copyOf(l, l.length + 1);
                l[l.length - 1] = nuevo;
            }

        } while (!"fin".equals(cadena));
        Arrays.sort(l);

        try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("lista.dat"))) {
            out.writeObject(l);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(Arrays.toString(l));
    }
}
