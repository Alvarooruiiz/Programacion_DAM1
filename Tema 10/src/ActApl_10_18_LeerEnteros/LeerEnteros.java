/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActApl_10_18_LeerEnteros;

import java.util.Arrays;

public class LeerEnteros {
    public static void main(String[] args) {
        String texto="123214";
        Integer[] tabla=leerEnteros(texto);
        
        System.out.println(Arrays.toString(tabla));
        
    }
    public static Integer[] leerEnteros(String texto){
        String[] t = texto.split("");
        Integer[] tabla = new Integer[t.length];
        
        for(int i=0; i<t.length;i++){
            tabla[i]=Integer.valueOf(t[i]);
        }
        return tabla;
    }
}


