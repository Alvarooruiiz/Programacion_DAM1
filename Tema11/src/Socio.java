import java.io.*;
import java.util.*;

public class Socio implements Serializable {
    private String nombre;
    private Date fechaIngreso;

    public Socio(String nombre, Date fechaIngreso) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }
    
    
}
