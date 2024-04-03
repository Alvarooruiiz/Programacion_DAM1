/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActRef_Ej2_Vehiculo;

/**
 *
 * @author alvar
 */
public class Vehiculo {
    int vehiculosCreados;
    int kilometrosTotales;
    int kilometrosRecorridos;

    public Vehiculo(int kilometrosTotales, int kilometrosRecorridos) {
        this.vehiculosCreados++;
        this.kilometrosTotales = kilometrosTotales;
        this.kilometrosRecorridos = kilometrosRecorridos;
    }
    
    
}
