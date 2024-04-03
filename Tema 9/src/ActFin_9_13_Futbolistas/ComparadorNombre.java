/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActFin_9_13_Futbolistas;

import java.util.Comparator;

/**
 *
 * @author alvar
 */
public class ComparadorNombre implements Comparator<Futbolista>{

    @Override
    public int compare(Futbolista o1, Futbolista o2) {
        int resultado; 
        return resultado=o1.getNombre().compareTo(o2.getNombre());
    }
    
}
