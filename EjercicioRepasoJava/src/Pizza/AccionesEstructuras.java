/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Pizza;

/**
 *
 * @author alvar
 */
public interface AccionesEstructuras<T> {
    //Inserta un elemento en la estructura y devuelve true si ha sido posible y false en caso contrario
    public boolean push(T elemento);
    //Devuelve el siguiente elemento que tiene que atender
    public T pop();
    //Devuelve true si la cola no tiene procesos, false en caso contrario
    public boolean esVacia();
    //Devuelve el numero de procesos que hay en la estructura
    public int getNumElementos();
}
