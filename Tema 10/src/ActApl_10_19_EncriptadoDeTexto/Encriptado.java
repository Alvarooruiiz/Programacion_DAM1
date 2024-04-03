/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActApl_10_19_EncriptadoDeTexto;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Encriptado {

    public static void main(String[] args) {
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        Scanner sc;
        String caracteres = "";
        String texto2 = "";
        char[] encriptado={};
        String textoEncriptado="";

//        char[] caracteres = texto.toCharArray();
        try {
            BufferedReader in = new BufferedReader(new FileReader("codec.txt"));
            String linea = in.readLine();
            sc= new Scanner(linea);
            caracteres=sc.nextLine();
            encriptado = caracteres.toCharArray();
            System.out.println(Arrays.toString(encriptado));

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            BufferedReader in = new BufferedReader(new FileReader("Carta.txt"));
            String linea = in.readLine();
            while (linea != null) {
                sc = new Scanner(linea);
                texto2 += sc.nextLine() + "\n";
                linea = in.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(caracteres);
        System.out.println(encriptado);
        
        
        textoEncriptado=encriptar(encriptado,texto2, alfabeto);
        
        System.out.println(textoEncriptado);
    }

    public static String encriptar(char[] encrip, String txt, String alfabeto) {
        char[] textoSeparado = txt.toCharArray();
        char[] alfabetoSeparado = alfabeto.toCharArray();
        String textoEncriptado= "";
        String resultado;
        
        for(int i=0; i<textoSeparado.length;i++){
            for(int j=0; j<alfabetoSeparado.length; i++){
                if(alfabetoSeparado[j]==textoSeparado[i]){
                    textoEncriptado+=encrip[j];
                }
            }
        }
         return textoEncriptado;
    
    }
}
