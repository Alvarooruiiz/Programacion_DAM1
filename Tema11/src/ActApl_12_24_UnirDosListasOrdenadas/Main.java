/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActApl_12_24_UnirDosListasOrdenadas;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Integer> lista1 = new TreeSet<>();
        Set<Integer> lista2 = new TreeSet<>();

        for (int i = 0; i < 20; i++) {
            int num = (int) (Math.random()*100+1);
            lista1.add(num);
        }
        for (int i = 0; i < 20; i++) {
            int num = (int) (Math.random()*100+1);
            lista2.add(num);
        }
        Set<Integer> listaCompleta = unirListas(lista1,lista2);
        System.out.println(lista1);
        System.out.println(lista2);
        System.out.println(listaCompleta);
    }

    public static Set<Integer> unirListas(Set<Integer> lista1, Set<Integer> lista2){
        
        Set<Integer> listaCompleta = new TreeSet<>();
        
        listaCompleta.addAll(lista1);
        
        listaCompleta.addAll(lista2);
        return listaCompleta;
    }
}
