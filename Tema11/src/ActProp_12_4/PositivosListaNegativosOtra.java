/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActProp_12_4;

import java.util.*;

/**
 *
 * @author alvar
 */
public class PositivosListaNegativosOtra {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n, sumaPositivos = 0, sumaNegativos = 0;
        ArrayList<Integer> listaPositivos = new ArrayList<>();
        ArrayList<Integer> listaNegativos = new ArrayList<>();

        do {
            System.out.println("Introduzca un numero real");
            n = sc.nextInt();
            if (n > 0) {
                listaPositivos.add(n);
            } else if(n<0) {
                listaNegativos.add(n);
            }
        } while (n != 0);

        sumaPositivos = suma(listaPositivos);
        sumaNegativos = suma(listaNegativos);

        System.out.println(listaPositivos + " y la suma es: " + sumaPositivos);
        System.out.println(listaNegativos + " y la suma es: " + sumaNegativos);

        Iterator<Integer> it1 = listaPositivos.iterator();
        while (it1.hasNext()) {
            n = it1.next();
            if (n > 10) {
                it1.remove();
            }
        }

        Iterator<Integer> it2 = listaNegativos.iterator();
        while (it2.hasNext()) {
            n = it2.next();
            if (n < -10) {
                it2.remove();
            }
        }
        sumaPositivos = suma(listaPositivos);
        sumaNegativos = suma(listaNegativos);

        System.out.println(listaPositivos + " y la suma es: " + sumaPositivos);
        System.out.println(listaNegativos + " y la suma es: " + sumaNegativos);
    }

    public static int suma(ArrayList<Integer> l) {
        int suma = 0;
        for (int i = 0; i < l.size(); i++) {
            suma += l.get(i);
        }
        return suma;
    }
}
