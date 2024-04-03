/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizza;

/**
 *
 * @author alvar
 */
public class PizzaCalzone extends Pizza{

    public PizzaCalzone(int id, int precio) {
        super(id, precio);
        precio=precio+incrementoPrecio();
    }
    
    public int incrementoPrecio(){
        return super.getPrecio()*5/100;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
