package Pizza;

public abstract class Pizza{
    private int id;
    private boolean bordeRelleno;
    private int segundosenHorno;
    private int precio;

    public Pizza(int id, boolean bordeRelleno, int precio, int segundosEnHorno) {
        this.id = id;
        this.bordeRelleno = bordeRelleno;
        this.precio = precio;
        this.segundosenHorno=segundosEnHorno;
    }

    public Pizza(int id, int precio) {
        this.id = id;
        this.precio = precio;
    }

    public int getSegundosenHorno() {
        return segundosenHorno;
    }

    public void setSegundosenHorno(int segundosenHorno) {
        this.segundosenHorno = segundosenHorno;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isBordeRelleno() {
        return bordeRelleno;
    }

    public void setBordeRelleno(boolean bordeRelleno) {
        this.bordeRelleno = bordeRelleno;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pizza{" + "id=" + id + ", bordeRelleno=" + bordeRelleno + ", precio=" + precio + '}';
    }
    
    
    
    
}
