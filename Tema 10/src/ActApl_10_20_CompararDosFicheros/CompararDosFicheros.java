/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActApl_10_20_CompararDosFicheros;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author alvar
 */
public class CompararDosFicheros {

    public static void main(String[] args) {
        String texto1 = "";
        String texto2 = "";
        Scanner sc;

        try {
            BufferedReader in = new BufferedReader(new FileReader("texto1.txt"));
            String linea = in.readLine();

            while (linea != null) {
                sc = new Scanner(linea);
                texto1 += sc.nextLine();
                linea = in.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
            try {
            BufferedReader in = new BufferedReader(new FileReader("texto2.txt"));
            String linea = in.readLine();

            while (linea != null) {
                sc = new Scanner(linea);
                texto2 += sc.nextLine();
                linea = in.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        if (texto1.equals(texto2)) {
            System.out.println("Los textos son iguales");
        }else if(texto1.length()!=texto2.length()){
            System.out.println("Los tamaños de los textos son distintos");
        }else {
            String[] txt1 = texto1.split("");
            String[] txt2 = texto2.split("");
            int i = 0;
            boolean distinto = true;
            while (distinto == true) {
                if (!txt1[i].equals(txt2[i])) {
                    distinto = false;
                }
                i++;
            }
            System.out.println("La diferencia se encuentra en el caracter numero " + i);
        }
    }
}
