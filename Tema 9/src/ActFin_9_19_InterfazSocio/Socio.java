package ActFin_9_19_InterfazSocio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Socio implements Comparable <Socio> {

    private int id;
    private String nombre;
    private int edad;
    private LocalDate fechaNac;

    public Socio(int id, String nombre, int edad, String fechaNac) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        
        
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-mm-yyyy");
        this.fechaNac=LocalDate.parse(fechaNac, f);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    
    @Override
    public int compareTo(Socio ob) {
        Socio otroSocio = (Socio) ob;
        int resultado;
        if (edad < otroSocio.edad) { //this va antes que ob
            resultado = 1; //o cualquier nimero negativo

        } else if (edad > otroSocio.edad) { //this va después que ob
            resultado = -1; //o cualquier nimero positivo

        } else {//this es igual que ob
            if (id < otroSocio.id) { //this va antes que ob
                resultado = 1; //o cualquier nimero negativo

            } else if (id > otroSocio.id) { //this va después que ob
                resultado = -1; //o cualquier nimero positivo

            } else {//this es igual que ob
                resultado=fechaNac.compareTo(otroSocio.fechaNac);
                if(resultado==0){
                    resultado=nombre.compareTo(otroSocio.nombre);
                }

            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Socio{" + "numero de socio=" + id + ", nombre=" + nombre + ", edad=" + edad+ "fecha de nacimiento=" + fechaNac + '}';
    }

}
