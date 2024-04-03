/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActApl_ConjuntoDinamico_7_21;


public class Main {
    public static void main(String[] args) {
        Conjunto prueba = new Conjunto();
        
        Integer array[]= {1,2,3,4,5};
        
        prueba.insertar(5);
        prueba.insertar(8);
        prueba.insertar(5);
        prueba.insertar(6);
        prueba.muestra();
        prueba.obtenerPosicion(6);
        prueba.eliminarElemento(8);
        prueba.muestra();
        prueba.insertar(array);
        
        prueba.muestra();
    }
}
