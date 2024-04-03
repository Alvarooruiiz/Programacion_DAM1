package Embarcaciones;

public abstract class Barco {
    private String codigo;
    private int longitud;

    protected Barco(String codigo, int longitud) {
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
        return "Barco{" + "codigo=" + codigo + ", longitud=" + longitud + '}';
    }
    
    
}
