package ActApl_11_16_ListaNombre;

import java.io.Serializable;
import java.util.Objects;

public class Lista implements Serializable, Comparable<Lista> {

    private String nombre;

    public Lista(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Lista{" + "nombre=" + nombre + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Lista other = (Lista) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public int compareTo(Lista ob) {
        int resultado = this.getNombre().compareTo(ob.getNombre());
        return resultado;
    }

}
