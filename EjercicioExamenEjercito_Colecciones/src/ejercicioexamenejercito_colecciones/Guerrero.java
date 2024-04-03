/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioexamenejercito_colecciones;

/**
 *
 * @author alvar
 */
public class Guerrero extends Personaje{
    private static int num=0;
    public Guerrero() {
        super("2"+ num, 15);
        num++;
    }
    
}
