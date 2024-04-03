package ejercicio2;

import java.io.Serializable;

public class EmpleadoTiempoParcial extends Empleado implements Serializable {
    
    private int horasTrabajadas;
    
    public EmpleadoTiempoParcial(String nombre, int edad, int horasTrabajadas) {
        super(nombre, edad, horasTrabajadas*15);
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
