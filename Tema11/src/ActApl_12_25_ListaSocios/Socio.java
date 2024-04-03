package ActApl_12_25_ListaSocios;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Socio implements Comparable<Socio>, Serializable{
    private String apodo;
    private String nombre;
    private LocalDate fecIng;

    public Socio(String apodo, String nombre, String fecIng){
        this.apodo = apodo;
        this.nombre = nombre;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fecIng = LocalDate.parse(fecIng,formato);
    }

    public Socio() {
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecIng() {
        return fecIng;
    }

    public void setFecIng(LocalDate fecIng) {
        this.fecIng = fecIng;
    }

    @Override
    public String toString() {
        return "Socio{" + "apodo=" + apodo + ", nombre=" + nombre + ", fecIng=" + fecIng + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.apodo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Socio other = (Socio) obj;
        return Objects.equals(this.apodo, other.apodo);
    }

    @Override
    public int compareTo(Socio o) {
        return o.apodo.compareTo(apodo);
    }
    
    
}
