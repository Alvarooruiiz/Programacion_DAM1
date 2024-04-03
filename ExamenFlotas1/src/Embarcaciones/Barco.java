package Embarcaciones;

public abstract class Barco implements java.io.Serializable{
    private String codigo;
    private int longitud;

    public Barco(String codigo, int longitud) {
        this.codigo = codigo;
        this.longitud = longitud;
    }

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

    @Override
    public String toString() {
        return "Codigo: " + codigo + ", Longitud: " + longitud + '}';
    }
    
    
}
