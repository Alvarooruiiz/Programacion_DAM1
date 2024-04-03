/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActApl_10_17_Mostrar24Lineas;

import java.io.*;
import java.util.Scanner;

public class Mostrar24Lineas {

    public static void main(String[] args) {
        Scanner sc;
        String texto="";
        int nLineas=1;
        try {
            BufferedReader in = new BufferedReader(new FileReader("texto2.txt"));
            String linea = in.readLine();

            while (linea != null || nLineas!=24) {
                sc = new Scanner(linea);
                texto += sc.nextLine();
                linea = in.readLine();
                nLineas++;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
