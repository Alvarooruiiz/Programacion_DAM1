package Alumno;

public class Alumnado {
    private int nie;
    private String nombre;
    private static int cont=1;

    public Alumnado(String nombre) {
        this.nie = cont;
        this.nombre = nombre;
        cont++;
    }

    public int getNie() {
        return nie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.nie;
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
        final Alumnado other = (Alumnado) obj;
        return this.nie == other.nie;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": NIE-> " + nie + " | Nombre-> " + nombre +"\n";
    }
    
    
}
