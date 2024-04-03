/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActRef_Ej5_Pizzas;

/**
 *
 * @author alvar
 */
public class Pizza {
    boolean estado;
    private static int pedidas;
    private static int servidas;
    String nombre;
    String tamanio;

    public Pizza(String nombre, String tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.pedidas++;
        this.estado=true;
    }

    public String getEstado() {
        if(!estado) {
            return "servida";
        } else return " pedida";
    }
    
    
    
    public void sirve(){
        if(!estado){
            System.out.println("La pizza ya esta servida");
        }else{
            this.estado=false;
            this.servidas++;
        }
        
    }
    
    public static int getTotalPedidas(){
        return Pizza.pedidas;
    }
    public static int getTotalServidas(){
        return Pizza.servidas;
    }
    
    public String toString(){
        return "pizza " + this.nombre + " " + this.tamanio + ", " + this.getEstado();
    }
}
