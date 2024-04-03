package EjercicioBarcos;

public abstract class Barco implements Comparable<Barco> {

    private String codigo;
    private int longitud;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public Barco(String codigo, int longitud) {
        this.codigo = codigo;
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "\nBarco{" + "codigo=" + codigo + ", longitud=" + longitud + '}';
    }

    @Override
    public int compareTo(Barco o) {
        return o.getLongitud() - (getLongitud());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.longitud;
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
        final Barco other = (Barco) obj;
        return this.longitud == other.longitud;
    }
    
    
}
