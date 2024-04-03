package Embarcaciones;

public abstract class Barco {

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
        if (longitud > 0) {
            this.longitud = longitud;
        }
    }

    @Override
    public String toString() {
        String s = "\n" + this.getClass().getSimpleName() + " -";
        s += "Código :" + codigo + " Longitud :" + longitud;
        return s;
    }

}
